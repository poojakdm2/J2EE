package com.jsipider.jdbc.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUpdate {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="UPDATE user SET password='pooja@789' WHERE id=1";
			statement.execute(query);
			System.out.println("updated succesfully");
			
			
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
	private static void openConnection() throws IOException, SQLException
	{
		File file=new File("C:/File/dbinfo.txt");
		FileReader fileReader=new FileReader(file);
		Properties properties=new Properties();
		properties.load(fileReader);
		connection=DriverManager.getConnection(properties.getProperty("url"),properties);
		//third way of implimenting overloaded getconnection methoed
	}
	private static void closeConnection() throws SQLException
	{
	   if(statement != null)
	   {
		   statement.close();
	   }
	   if(connection != null)
	   {
		   connection.close();
	   }
	}
	

}
