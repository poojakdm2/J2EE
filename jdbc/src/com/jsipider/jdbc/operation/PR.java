package com.jsipider.jdbc.operation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PR {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	public static void main(String[] args)  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user id");
		int id=scanner.nextInt();
		scanner.nextLine();
		
		scanner.close();
		try {
			openConnection();
			query="DELETE FROM admin WHERE id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			
			
			int res=preparedStatement.executeUpdate();
			if(res==1)
			{
				System.out.println("data is inserted sucessfully");
			}
			else
			{
				System.out.println("please enter a valid details");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
	private static void openConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","ROOT");
		
	}	
	private static void closeConnection() throws SQLException
	{
		if(preparedStatement !=null)
		{
			preparedStatement.close();
		}
		if(connection !=null)
		{
			connection.close();
		}
	}
	

}
