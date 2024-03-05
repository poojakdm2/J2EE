
package com.jspiders.filehandeling.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\File\\char.txt");
		if(file.exists())
		{
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("java is a programming language");
		fileWriter.close();
		}else
		{
			boolean status=file.createNewFile();
			if(status)
			{
				System.out.println("file is created");
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("java is a programming language");
				fileWriter.close();
			}else
			{
				System.out.println("File is not created");
			}
		}
	}
	
	

}
