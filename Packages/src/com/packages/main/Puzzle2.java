package com.packages.main;

public class Puzzle2 {

	public static void main(String[] args) {
		/*
		 * 12. Number Puzzle II

Use nested for loops to generate a list of all the two digit numbers which are less 
than or equal to fifty-six, and the sum of whose digits is greater than ten.
		 */
		for(int i=10;i<=56;i++)
		{
			int f=i/10;
			int s=i % 10;
			if(f+s>10)
			{
				System.out.println(i);
			}
		}

	}

}
