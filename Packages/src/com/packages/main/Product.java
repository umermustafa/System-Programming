package com.packages.main;

import java.util.Scanner;

//import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your first number");
		float f,s,t;
		f=scanner.nextFloat();
		System.out.println("What is your second number");
		s=scanner.nextFloat();
		System.out.println(f+" * "+s+" = "+(f*s));
		scanner.close();
	}

}
