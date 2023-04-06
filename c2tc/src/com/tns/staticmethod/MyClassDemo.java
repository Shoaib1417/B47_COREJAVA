package com.tns.staticmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		System.out.println(ob);
		MyClass.display();// can call static method by class name
	}

}