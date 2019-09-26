package com.packages.main;

import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		double wage;
		System.out.println("Hello. What's your name?");
		name=scanner.nextLine();
		System.out.println("Hi "+name+"! How old are you?");
		age=scanner.nextInt();
		System.out.println("So you're "+age+", eh? That's not old at all!");
		System.out.println("How much do you make, "+name);
		wage=scanner.nextDouble();
		System.out.println(wage+"! That's really good for your "+age);
		scanner.close();
	}

}
