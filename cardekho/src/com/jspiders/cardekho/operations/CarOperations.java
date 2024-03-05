package com.jspiders.cardekho.operations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarOperations {
	
	Scanner scanner=new Scanner(System.in);
	

	private List<Car> cars = new ArrayList<Car>();
	Scanner sc = new Scanner(System.in);
	Car car;

	public void viewAllCars() {
		if (car == null) {
			System.out.println("There is no car to show Please visit again after some time");

		} else {
			for (Car car : cars) {
				System.out.println(car);
			}
		}
	}

	public void searchByName() {
		boolean flag = false;
		System.out.print("Enter the name of the car :");
	    String nameToSearch = sc.next();
	    for (Car car : cars) {
	        String carName = car.getName();
	        if (carName.equals(nameToSearch)) {
	            System.out.println(car);
	            flag = true;
	            }
	    }

	    if (!flag) {
	        System.out.println("Car not found");
	    }
	}	
	public void searchById() {
		boolean flag = false;
		System.out.print("Enter the Id  of car that you want to search :");
		int id = sc.nextInt();
		for (Car car : cars) {
			if (car.getId()==id) {
				System.out.println(car);
				flag = true;
				break;
				}
			}
		if (!flag) {
			System.out.println("Car not found");
			}
		}

	public void searchByBrand() {
		boolean flag = false;
		System.out.print("Enter the name of the Brand :");
		String brand = sc.next();
		for (Car car : cars) {
			String carBrand = car.getBrand();
			if (carBrand.equals(brand)) {
				System.out.println(car);
				flag = true;
		            
		        }
		    }

		    if (!flag) {
		        System.out.println("Car not found");
		    }
		
	}

	public void searchByFuelType() {
		

		 boolean flag = false;

		    System.out.print("Enter the Fuel type of the car");
		    String fuelType = sc.next();

		    for (Car car : cars) {
		        String fuel = car.getFuelType();

		        if (fuel.equals(fuelType)) {
		            System.out.println(car);
		            flag = true;
		            
		        }
		    }

		    if (!flag) {
		        System.out.println("Car not found");
		    }
		}

	
	
	public void searchBycolor()
	{

		 boolean flag = false;

		    System.out.print("Enter the color of the car");
		    String colorToSearch = sc.next();

		    for (Car car : cars) {
		        String carColor = car.getColor();

		        if (carColor.equals(colorToSearch)) {
		            System.out.println(car);
		            flag = true;
		            
		        }
		    }

		    if (!flag) {
		        System.out.println("Car not found");
		    }
			
		}
		
		

	public void searchByPrice() {
		boolean flag=false;
		System.out.print("Enter the minnimum range :");
		double minrange=sc.nextDouble();
		System.out.print("Enter the maximum range :");
		double maxrange=sc.nextDouble();
        for(Car car:cars)
        {
        	double price=car.getPrice();
        	if(price>=minrange && price<=maxrange)
        	{
        		System.out.println(car);
        		flag=true;
        	}
        	
        }
        if(!flag)
        {
        	System.out.println("car not found");
        }
	}
   

   public void addCar() {
		System.out.print("How many cars do you want to add ");

		int choice = sc.nextInt();
		for (int i = 1; i <= choice; i++) {
			car = new Car();

			System.out.print("Enter Id :");
			int id = sc.nextInt();
			car.setId(id);
			sc.nextLine();

			System.out.print("Enter name :");
			String name = sc.nextLine();
			car.setName(name);

			System.out.print("Enter brand name:");
			String brand = sc.nextLine();
			car.setBrand(brand);

			System.out.print("Enter fuel type:");
			String fuelType = sc.nextLine();

			car.setFuelType(fuelType);

			System.out.print("Enter car color:");
			String color = sc.nextLine();
			car.setColor(color);
            
			System.out.print("Enter Price :");
			double price = sc.nextDouble();

			car.setPrice(price);
			cars.add(car);

		}
	}

	public void removeCar() {
		boolean flag = false;
		viewAllCars();
		System.out.println("Enter the car Id that you want to remove");
		int id = sc.nextInt();

		for (Car car : cars) {
			if (car.getId() == id) {
				flag = true;
				cars.remove(car);
				System.out.println("Car deleted.");
				break;
			}

		}
		if (!flag) {
			System.out.println("Car not found");
		}

	}

	public void editCar() {
		boolean flag = false;
		System.out.println("Enter car Id");
		int id = sc.nextInt();
		for (Car car : cars) {
			if (car.getId() == id) {
				flag = true;
				System.out.println("Enter the price of the car ");
				double price = sc.nextDouble();
				car.setPrice(price);
				System.out.println("Car price updated sucessfully");

			}
		}
		if (!flag) {
			System.out.println("Car not found");
		}

	}

}
