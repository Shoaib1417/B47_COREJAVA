package com.tns.staticmethod;

public class MyClass {
	private int section;// instance variable
	private static int srno;// static variable

	static {// static block
		System.out.println("inside static");
		srno = 100;
	}

	MyClass() {// constructor default

		System.out.println("default constructor");
		srno++;// non static method or constructor can access static variable
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}

	static void display() {
		/* System.out.println("section"+section); */
		System.out.println("serial no" + srno);

	}
}