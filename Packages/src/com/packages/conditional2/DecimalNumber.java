package com.packages.conditional2;

import java.util.Scanner;

public class DecimalNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		double num=scanner.nextDouble();
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0)
		{
			if(num>=0 && num<1)
			{
				System.out.println("Small Positive number");
			}
			else if(num>1000000)
			{
				System.out.println("Large Positive number");
			}
			else
			{
				System.out.println("Positive number");
			}
			
		}
		else
		{
			System.out.println("Negative number");
		}

	}

}
