package com.tns.exceptionhandling;

public class DefaultDemo {

	public static void main(String[] args) {
		//assignment -->equals()
		String str=null;
		try {
			str.equals("Hello");
		} catch (Exception e) {
			System.out.println("null pointer exception");
		}
	}

}