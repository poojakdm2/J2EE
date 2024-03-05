package com.jspiders.serializationanddeserealization.serialization;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serializationanddeserealization.object.User;

public class Serialization {
	public static void main(String[] args) throws IOException {
		File file=new File("c:\\File\\Demo.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User(1, "pooja", "pooja@gmail.com", 915639716));
		System.out.println("Object has been serialized");
		objectOutputStream.close();
		fileOutputStream.close();
	}

}
