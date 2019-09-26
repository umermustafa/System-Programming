package com.packages.main;

public class stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaces=4;
		char star='*';
		for(int i=1;i<=5;i++)
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
