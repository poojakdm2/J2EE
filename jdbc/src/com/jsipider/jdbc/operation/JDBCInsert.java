package com.jsipider.jdbc.operation;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		//Load and register the driver
		Driver driver=new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(driver);
	    //Open connection 
	    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=ROOT");
	    //create the statement 
	    Statement statement=connection.createStatement();
	    //execute the statement
	    statement.execute("INSERT INTO user VALUES(2,'Arti','Arati@gmail.com','Arti@123')");
	    //Process the result
	    System.out.println("Data is inserted");
	    //close the connection
	    connection.close();
	    statement.close();
	    //DeRegister the driver
	    DriverManager.deregisterDriver(driver);
	}
	

}