package com.jsipider.jdbc.jdbctask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task3 {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="SELECT * FROM student where name LIKE '%jay%'";
			statement.execute(query);
			resultSet=statement.getResultSet();
			while(resultSet.next())
			{
				
				System.out.println(resultSet.getString(2));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	private static void openConnection()throws SQLException{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","ROOT");
		//second way of implementing getconnection methoed;
	}
	private static void closeConnection()throws SQLException{
		if(statement !=null)
		{
			statement.close();
		}
		if(connection !=null)
		{
			connection.close();
		}
	}


}
