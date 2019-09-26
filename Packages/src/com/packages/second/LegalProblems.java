package com.packages.second;

import java.util.Scanner;

public class LegalProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hey, Whats your age?");
		int age=scanner.nextInt();
		if(age<16)
		{
			System.out.println("You can't drive");
		}
		if(age<18)
		{
			System.out.println("You can't vote");
		}
		if(age<25)
		{
			System.out.println("You can't rent a car");
		}
		if(age>=25)
		{
			System.out.println("You can do anything that legal");
		}
		
		int a
		
	}

}
