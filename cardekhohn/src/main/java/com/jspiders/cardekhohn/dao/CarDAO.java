package com.jspiders.cardekhohn.dao;

import java.util.Scanner;


public class CarDAO {
	static boolean loop = true;
	static CarOp op=new CarOp();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (loop) {
			mainMenu();
		}
	}

	private static void mainMenu() {
		System.out.println("*****Main Menu*****\n" + "1. View All Cars\n" + "2. Search Cars\n" + "3. Add Cars\n"
				+ "4. Remove Cars\n" + "5. Edit Cars\n" + "6. Exit");
		int choice = 0;
		while (true) {
			try {
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter a valid choice!");
				sc.nextLine();
				continue;
			}
			break;
		}
		switch (choice) {
		case 1:
			op.viewAllCars();
			break;
		case 2:
			System.out.println("*****Search Car*****\n" + "1. Search by Name\n" + "2. Search by Brand\n"
					+ "3. Search by Fuel Type\n" + "4. Search by Color\n" + "5. Search by Price\n" + "6. Go Back\n");
			int choice1 = 0;
			while (true) {
				try {
					System.out.print("Enter your choice: ");
					choice1 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter a valid choice!");
					sc.nextLine();
					continue;
				}
				break;
			}
			
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
				op.searchByColor();
				break;
			case 5:
				op.searchByPrice();
				break;
			case 6:
				System.out.println("Go back to main menu..");
				mainMenu();
				break;
			default:
				System.out.println("Invalid input..Please try again..!");
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
			System.out.println("Thank you!");
			loop = false;
			break;
		default:
			System.out.println("Invalid input..Please try again with valid input!");
			break;
		}
	}

}
