package com.jspiders.designpattern.structural;

public class Adapter extends Employee implements Event{

	@Override
	public void womensDay() {
         System.out.println("The chief guest for women day is "+getName());		
	}

	@Override
	public void mensDay() {
         System.out.println("chief guest for mens day is "+getName());		
	}
	

}
