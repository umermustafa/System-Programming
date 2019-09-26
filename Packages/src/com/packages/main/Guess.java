package com.packages.main;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tries=0;
		Scanner scanner=new Scanner(System.in);int cguess=45;
		int input=scanner.nextInt();
		while(input!=cguess) {
			if(input==cguess) {
				System.out.println("You guessed in a first try");
			}
			else {
				tries++;
				if(input-cguess<=10 && input-cguess>=-10) {
					System.out.println("Your guess was close");
				}
				else{
					System.out.println("Your guess was low");
				}
				System.out.println("try again");
				 input=scanner.nextInt();
				
			}
		}
		System.out.println("You guessed in "+ tries+" tries");
	}

}
