package com.packages.main;

public class Puzzle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=45;i++)
		{
			for(int j=0;j<=45;j++)
			{
				for(int k=0;k<=45;k++)
				{
					for(int l=0;l<=45;l++)
					{
						if(i+j+k+l==45 && i+2==j-2 && j-2==k*2 && k*2==l/2) {
							System.out.println(i+" "+j+" "+k+" "+l);
						}
					}
				}
			}
		}
	}

}
