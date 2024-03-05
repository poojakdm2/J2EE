package com.jspiders.designpattern.creational;

public class SingleToneEager {
	private static SingleToneEager singleToneEager=new SingleToneEager();
	private SingleToneEager()
	{
		System.out.println("Constroctor is invoked");
	}
	public static SingleToneEager getobject() {
		return singleToneEager;
	}
	

}
