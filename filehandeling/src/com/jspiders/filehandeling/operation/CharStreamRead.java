package com.jspiders.filehandeling.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\File\\Demo.txt");
		if(file.exists())
		{
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			fileReader.close();
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			System.out.println("data is fetch from the file");
		}else
		{
			System.out.println("file does not exist");
		}
	}

}
