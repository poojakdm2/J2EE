package com.jspiders.serializationanddeserealization.dserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serializationanddeserealization.object.User;

public class Dserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file=new File("C:\\File\\Demo.txt");
	FileInputStream fileInputStream=new FileInputStream(file);
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	User user=(User) objectInputStream.readObject();
	System.out.println(user);
	System.out.println("Object is dserialized");
	objectInputStream.close();
	fileInputStream.close();
	
    
	
}

}
