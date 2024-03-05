package com.jspiders.filehandeling.operation;

import java.io.File;

public class Pr {
public static void main(String[] args) {
	File file=new File("c:\\File\\Demo.txt");
	if(file.exists())
	{
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		if(file.canExecute())
		{
			System.out.println("file is executable");
		}
		else
		{
			System.out.println("file is not executable");
		}
		if(file.canRead())
		{
			System.out.println("file is readable");
		}
		else
		{
			System.out.println("file is not readbale");
		}
	}
	else
	{
		System.out.println("file does not exist");
	}
}
}
