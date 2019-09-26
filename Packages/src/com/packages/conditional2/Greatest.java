package com.packages.conditional2;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a first number");
		int num1=scanner.nextInt();
		System.out.println("Please enter a second number");
		int num2=scanner.nextInt();
		System.out.println("Please enter a third number");
		int num3=scanner.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("The greatest is: "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The greatest is: "+num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("The greatest is: "+num3);
		}
		
	}

}
