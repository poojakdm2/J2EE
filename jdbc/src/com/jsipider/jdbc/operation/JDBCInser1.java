package com.jsipider.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInser1 {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		
		try {
			openConnection();
			statement=connection.createStatement();
			query="INSERT INTO user VALUES(5,'Mahesh','mahesh@gmail.com','Mahesh@123')";
			statement.execute(query);
			System.out.println("data inserted");
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
	private static void  openConnection() throws SQLException{
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=ROOT");
		// TODO Auto-generated method stub
		//first way of creating connection which accept one argument
		
	}
	private static void closeConnection() throws SQLException{
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
