package com.jsipider.jdbc.jdbcmain;

import java.util.Scanner;
import com.jsipider.jdbc.operation.JDBCService;

public class JDBCMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter 1 to SignUp\nEnter 2 to logIn\nEnter 3 to logout");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				JDBCService.signUp(scanner);
				break;
			case 2:
				JDBCService.logIn(scanner);
				break;
			case 3:
			     flag=false;
			     System.out.println("Thank you for visiting us");
				break;

			default:
			   System.out.println("Enter valid choice");
				
			}
		}
	}

}
