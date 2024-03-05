package com.jspiders.cardekhohn.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.cardekhohn.dto.Car;


public class CarOp {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	Scanner scanner=new Scanner(System.in);
	
	public void viewAllCars()
	{
		openConnection();
		entityTransaction.begin();
		List<Car> cars=findAll();
		
		
		for(Car car:cars)
		{
			System.out.println(car);
		}
		
		entityTransaction.commit();
		closeConnection();
		
	}
	private static List<Car> findAll()
	{
		javax.persistence.Query query=entityManager.createQuery("SELECT car FROM Car car");
		@SuppressWarnings("unchecked")
		List<Car> cars=query.getResultList();
		return cars;
		
		
	}
	public void searchByName()
	{
		
	}
	
	
	
	public void searchByBrand()
	{
		
	}
	public void searchByFuelType()
	{
		
	}
	public void searchByColor()
	{
		
	}
	public void searchByPrice()
	{
		
	}
	public void addCar()
	{
		System.out.println("How many car you want to add");
		int choice=scanner.nextInt();
		if(choice<=0)
		{
			System.out.println("please enter a valid choice");
			choice =scanner.nextInt();
		}
		
		openConnection();
		entityTransaction.begin();
		  
		for(int i=1;i<=choice;i++)
		{
			Car car=new Car();
			scanner.nextLine();
			System.out.println("Enter the car name");
			String name=scanner.nextLine();
			
	
			System.out.println("Enter the model name");
			String modelName=scanner.nextLine();
			
			System.out.println("Enter the fuel type");
			String fuelType=scanner.nextLine();
			
			System.out.println("Enter the Car color ");
			String color=scanner.nextLine();
		
			System.out.println("Enter the car price");
			double price=scanner.nextDouble();
			
			
			car.setName(name);
			car.setModel(modelName);
			car.setFuel_Type(fuelType);
			car.setColor(color);
			car.setPrice(price);
			
			entityManager.persist(car);
			
			
			
		}
		entityTransaction.commit();
		System.out.println("Cars added sucessfully");
		
		
		closeConnection();
	}
	
	public void removeCar()
	{
		
	}
	public void editCar()
	{
		
	}
	
	
	
	
	
	private static void openConnection()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("car");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	private static void closeConnection()
	{
		if(entityManagerFactory !=null)
		{
			entityManagerFactory.close();
		}
		if(entityManager !=null)
		{
			entityManager.close();
		}
		if(entityTransaction !=null)
		{
			if(entityTransaction.isActive())
			{
				entityTransaction.rollback();
			}
		}
	}
}
