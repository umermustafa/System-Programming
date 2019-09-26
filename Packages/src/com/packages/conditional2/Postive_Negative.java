package com.packages.conditional2;

import java.util.Scanner;

public class Postive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scanner.nextInt();
		if(num<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is positive");
		}

	}

}
