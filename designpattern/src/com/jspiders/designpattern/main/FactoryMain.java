package com.jspiders.designpattern.main;

import java.util.Scanner;

import com.jspiders.designpattern.creational.Beverage;
import com.jspiders.designpattern.creational.GingerTea;
import com.jspiders.designpattern.creational.GreenTea;
import com.jspiders.designpattern.creational.LemonTea;
import com.jspiders.designpattern.creational.MasalaTea;

public class FactoryMain {
	public static void main(String[] args) {
		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No tea is order");
			e.printStackTrace();
		}
	}
	private static Beverage factory()
	{
		Beverage beverage=null;
		System.out.println("Enter 1 to order Masala Tea\n"+
		                    "Enter 2 to order Green Tea\n"+
				             "Enter 3 to order Ginger Tea\n"
		                     +"Enter 4 to order Lemon Tea");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			   beverage =new MasalaTea();
			   
			break;
		case 2:
			beverage=new GreenTea();
			break;
		case 3:
			beverage=new GingerTea();
			break;
		case 4:
			beverage=new LemonTea();
			break;

		default:System.out.println("Please enter valid choice ");
			break;
		}
		return beverage;
	}

}
