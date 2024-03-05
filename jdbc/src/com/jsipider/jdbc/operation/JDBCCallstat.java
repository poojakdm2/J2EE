package com.jsipider.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JDBCCallstat {
	private static Connection connection;
	private static java.sql.CallableStatement callableStatement;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			openConnection();
			query="call sort()";
			callableStatement=connection.prepareCall(query);
			callableStatement.execute();//using execute because set of instruction are unknown
			resultSet=callableStatement.getResultSet();
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(2));
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
	private static void closeConnection() throws SQLException {
		if(callableStatement !=null)
		{
			callableStatement.close();
		}
		if(connection !=null)
		{
			connection.close();
		}
		
	}

}
