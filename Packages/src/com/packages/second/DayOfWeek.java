package com.packages.second;

import java.util.Scanner;

public class DayOfWeek {

	public static String day(int n)
	{
		String day="";
		if(n==1)
		{
			 day="Monday"; 
		}
		else if(n==2)
		{
			day="Tuesday";
		}
		else if(n==3)
		{
			day="Wednesday";
		}
		else if(n==4)
		{
			day="Thursday";
		}
		else if(n==5)
		{
			day="Friday";
		}
		else if(n==6)
		{
			day="Saturday";
		}
		else if(n==7)
		{
			day="Sunday";
		}
		else
		{
			day="does not exist";
		}
		return day;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter an integer(1-7)");
		int num=scanner.nextInt();
		System.out.println("Weekday "+num+" is "+day(num));
	}

}
























