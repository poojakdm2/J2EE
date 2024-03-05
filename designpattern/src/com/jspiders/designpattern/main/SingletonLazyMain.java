package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.SingleTonLazy;

public class SingletonLazyMain {
	public static void main(String[] args) {
		SingleTonLazy singleTonLazy1=SingleTonLazy.getobject();
		System.out.println(singleTonLazy1);
		SingleTonLazy singleTonLazy2=SingleTonLazy.getobject();
		System.out.println(singleTonLazy2);
	}

}
