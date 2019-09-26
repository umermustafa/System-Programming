package com.packages.main;

import java.util.Scanner;

public class ModifyStars {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int input=scanner.nextInt();
		int spaces=input-1;
		char star='*';
		for(int i=1;i<=input;i++)
		{
			for(int k=0;k<spaces;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(" "+star);
			}
			System.out.println();
			spaces--;
		}
	}

}
