package com.packages.main;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Your height in m:");
		float h,w;
		h=scanner.nextFloat();
		System.out.println("Your weight in kg:");
		w=scanner.nextFloat();
		System.out.println("Your BMI is "+(w/(h*h)));
	}

}
