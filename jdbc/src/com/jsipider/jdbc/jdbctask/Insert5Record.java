package com.jsipider.jdbc.jdbctask;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert5Record {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Stuident name");
		String name=scanner.nextLine();
		System.out.println("Enter Student email");
		String email=scanner.nextLine();
		System.out.println("Enter Student age");
		int age=scanner.nextInt();
		scanner.close();
		
		try {
			openConnection();
			query="INSERT INTO student VALUES(?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);//placeholder start from 1
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setInt(4, age);
			int res=preparedStatement.executeUpdate();
			System.out.println(res+"row(s) affected");
			
			
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
