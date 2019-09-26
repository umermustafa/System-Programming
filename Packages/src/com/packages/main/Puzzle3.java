package com.packages.main;

import java.util.Scanner;

public class Puzzle3 {
	
	public static int cube(int n)
	{
		return n*n*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
		 *  For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
		 */
	//	Scanner scanner=new Scanner(System.in);
		//int num=scanner.nextInt();
		for(int i=100;i<=999;i++)
		{
			int num=i;
			int c,n,temp=0;
			n=num;
			while(num>0)
			{
				c=num%10;
				num=num/10;
				temp=temp+c*c*c;
			}
			if(temp==n) {
				System.out.println(i);
			}
		}
		

	}

}
