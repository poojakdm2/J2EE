package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.Contact;
import com.jspiders.designpattern.creational.ContactBuilder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact=new ContactBuilder().setFirstName("ram").setMobile(9156397169l).buildContact();
		System.out.println(contact);
	}

}
