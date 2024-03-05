package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource;

public class MyThread6 extends Thread {
	private MyResource myResource;
	public MyThread6(MyResource myResource)
	{
		this.myResource=myResource;
	}
	@Override
	public void run() {
		synchronized (myResource.resource1) {
			System.out.println("lock is applied on resource1 by thread 6");
		}
			synchronized (myResource.resource2) {
				System.out.println("lock is applied on resource 2 by thread6");
			}
		}
	
	

}
