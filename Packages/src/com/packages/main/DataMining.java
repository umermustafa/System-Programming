package com.packages.main;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the following information so I can sell it for a profit!");
		String fname,lname,login;
		int grade,id;
		double gpa;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Name");
		fname=scanner.nextLine();
		System.out.println("Enter Last Name");
		lname=scanner.nextLine();
		System.out.println("Enter your grade");
		grade=scanner.nextInt();
		System.out.println("Enter  ID");
		id=scanner.nextInt();
		System.out.println("Enter Login");
		login=scanner.next();
		System.out.println("Enter GPA");
		gpa=scanner.nextDouble();
		System.out.println("Login: "+login);
		System.out.println("ID: "+id);
		System.out.println("Name: "+lname+" "+fname);
		System.out.println("GPA: "+gpa);
	}

}
