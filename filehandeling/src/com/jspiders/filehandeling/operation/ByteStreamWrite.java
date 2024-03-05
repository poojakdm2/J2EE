package com.jspiders.filehandeling.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\File\\Demo.txt");
		if(file.exists())
		{
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(1244);
			System.out.println("data is written to the file");
			fileOutputStream.close();
		}
		else
		{
			boolean status=file.createNewFile();
			if(status)
			{
				System.out.println("File is created");
				FileOutputStream fileOutputStream=new FileOutputStream(file);
				fileOutputStream.write(1244);
				System.out.println("Data is written");
				fileOutputStream.close();
			}
			else
			{
				System.out.println("file is not created");
			}
		}
	}
}
