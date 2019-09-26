package com.packages.main;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		System.out.println("Hello. What's your name?");
		name=scanner.nextLine();
		System.out.println("Hi "+name+"! How old are you?");
		age=scanner.nextInt();
		System.out.println("Five years ago you were "+(age-5)+" and you will be "+(age+5)+" in next five years");
	}

}
