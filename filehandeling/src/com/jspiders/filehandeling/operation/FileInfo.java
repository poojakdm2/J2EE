package com.jspiders.filehandeling.operation;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file=new File("C:\\File\\Demo.txt");
		if(file.exists())
		{
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			if(file.canWrite())
			{
				System.out.println("file is writeable");
			}else {
				System.out.println("File is not witeable");
			}
			if(file.canRead())
			{
				System.out.println("File is readable");
			}
			else
			{
				System.out.println("File is not redaable");
			}
			if(file.canExecute())
			{
				System.out.println("file is executable");
			}
			else
			{
				System.out.println("file is not executable");
			}
			
		}else
		{
			System.out.println("file does not exist");
		}
				
	}

}
