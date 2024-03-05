package com.jsipider.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="DELETE FROM user WHERE id=3";
			int res=statement.executeUpdate(query);//Work for DML Command it return number of rows affected
			System.out.println("user deleted");
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	private static void openConnection() throws SQLException
	{
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","ROOT");
		
	}
	private static void closeConnection() throws SQLException
	{
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
