package com.packages.main;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numer in Inches");
		float inch=scanner.nextFloat();
		System.out.println(inch+" is equal to "+(inch/39.37)+" meters");
		scanner.close();
	}

}
