package com.packages.main;

import java.util.Random;
import java.util.Scanner;

public class Random_Guess {

	public static void main(String[] args) {
		Random random=new Random();
		int number=random.nextInt(100);
		Scanner scanner=new Scanner(System.in);
		int wa=0;
		while(wa<8)
		{
			int input=scanner.nextInt();
			if(input==number)
			{
				System.out.println("You guessed the number");
				break;
			}
			else if(input<number) {
				System.out.println("You number is less than the random number");
				wa++;
			}
			else if(input>number) {
				System.out.println("You number is greater than the random number");
				wa++;
			}
		}
		System.out.println("You failed to guess the number");
		
	};

}
