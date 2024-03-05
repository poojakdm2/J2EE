package com.jspiders.filehandeling.operation;

import java.io.File;
import java.io.IOException;

public class CreateNewFile1 {
	public static void main(String[] args) {
		//create file using absolute path
		File file=new File("C:\\File\\Demo.txt");
		try {
			boolean status=file.createNewFile();
			if(status)
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("file is already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
