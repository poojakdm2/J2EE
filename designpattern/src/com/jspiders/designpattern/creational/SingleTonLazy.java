package com.jspiders.designpattern.creational;

public class SingleTonLazy {
	private static SingleTonLazy singleTonLazy;
	private SingleTonLazy()
	{
		System.out.println("constroctor is invoked");
	}
	public static SingleTonLazy getobject()
	{
		if(singleTonLazy==null)
		{
			singleTonLazy=new SingleTonLazy();
		}
		return singleTonLazy;
	}

}
