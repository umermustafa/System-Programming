package com.packages.main;

public class Puzzle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 11. Number Puzzle I

Use nested for loops to generate a list of all the pairs of positive two digit 
numbers whose sum is 60, and whose difference is 14.
		 */
		for(int i=10;i<=99;i++)
		{
			for(int j=10;j<=99;j++)
			{
				if(Math.abs(i-j)==14 && i+j==60) {
					System.out.println(i+" "+j);
				};
				
			}
		}

	}

}
