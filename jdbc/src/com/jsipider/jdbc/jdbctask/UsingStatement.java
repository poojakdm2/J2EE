package com.jsipider.jdbc.jdbctask;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingStatement {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		
		try {
			openConnection();
			statement=connection.createStatement();
			query="INSERT INTO student VALUES"
			+"(9,'Nilesh','Nilesh@gmail.com',22),"
		    +"(10,'Anant','anant@gmail.com',21),"
		    +"(11,'Akash','Akash@gmail.com',23),"
		    +"(12,'Sita','siat@gmail.com',22),"
		    +"(13,'Ram','ram@gmail.com',24)";
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
