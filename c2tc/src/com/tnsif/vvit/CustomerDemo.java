package com.tnsif.vvit;
import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,city;
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the city");
		city=sc.nextLine();
		System.out.println("enter the id");
		id=sc.nextInt();
		customer ob = new customer();
		ob.setCustomername(name);
		ob.setCustomercity(city);
		ob.setCustomerid(id);
		System.out.println(name);
		System.out.println(city);
		System.out.println(id);
		

	}

}
