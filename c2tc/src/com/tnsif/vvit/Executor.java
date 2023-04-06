package com.tnsif.vvit;
import java .util.Scanner;
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.forword();
		ob.backward();
		ob.stop();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the reg");
		int reg = sc.nextInt();
		System.out.println("the reg no is"+reg);
		System.out.println("enter the color");
	String color=sc.nextLine();
		System.out.println("the color is"+color);
	
		
		
		
		
       
	}

}
