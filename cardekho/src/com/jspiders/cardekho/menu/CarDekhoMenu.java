package com.jspiders.cardekho.menu;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperations;

public class CarDekhoMenu {
	static boolean loop = true;
	static CarOperations op = new CarOperations();

	public static void main(String[] args) {
		while (loop) {
			mainMenu();
		}
	}

	private static void mainMenu() {

		System.out.println("=============Main Menu=============\n" + "1.View All Cars\n" + "2.Search Car\n"
				+ "3.Add Car\n" + "4.Remove Car\n" + "5.Edit Car\n" + "6.Exit \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select operation that you want to perform");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			op.viewAllCars();

			break;

		case 2:

			System.out.println("========Search=========\n" + "1.Search By Name\n" + "2.Serach By Brand\n"
					+ "3.Search By Fuel Type\n" + "4.Search By Price\n" +"5.Search By Id\n" +"6.Search By Color\n"+"7.Go Back");

			int choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				op.searchByName();
				break;
			case 2:
				op.searchByBrand();
				break;
			case 3:
				op.searchByFuelType();
				break;
			case 4:
				op.searchByPrice();
				break;
			case 5:
				op.searchById();
				break;
			case 6:
				op.searchBycolor();
				break;
			case 7:
				System.out.println("Go back to main menu...");
				mainMenu();
				break;
			default:
				System.out.println("please enter a valid input");
				break;
			}

			break;
		case 3:

			op.addCar();

			break;
		case 4:
			op.removeCar();
			break;
		case 5:
			op.editCar();
			break;
		case 6:
			System.out.println("Thank you visit again");
			loop = false;
			break;
		default:
			System.out.println("please enter the valid choice");
			break;

		}

	}

}
