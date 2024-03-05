package com.jspiders.multithreading.resource;

public class Food {
	private boolean available;
	public synchronized void order()
	{
		System.out.println("order is recived");

	if(available)
	{
		System.out.println("order is delivered0");
		
	}
	else
	{
		System.out.println("food is not delivered");
		System.out.println("Wait for some time");
		try {
			wait();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		if(available)
		{
			System.out.println("order is delivered");
		}
	}
}
	public synchronized void prepare()
	{
		System.out.println("food is getting prepared");
		System.out.println("food is prepared");
		available=true;
		notify();
	}

}
