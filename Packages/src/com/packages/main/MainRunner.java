package com.packages.main;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		int cpin=5678;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 4 digit pin");
		int pin=scanner.nextInt();
		while(pin!=cpin) {
			
			if(pin==cpin) {
				System.out.println("Pin accepted.You have $0.00 in your account");
			}else {
				System.out.println("Incorrect pin.Try again");
				pin=scanner.nextInt();
		}
	}
		System.out.println("Pin accepted.You have $0.00 in your account");

	}}
