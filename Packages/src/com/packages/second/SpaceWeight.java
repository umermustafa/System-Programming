package com.packages.second;

import java.util.Scanner;

public class SpaceWeight {
	public static double relativeWeight(int n,double rw)
	{
		double wt=0.0f;
		if(n==1)
		{
			  wt=rw*0.78;
		}
		else if(n==2)
		{
			wt=rw*0.39;
		}
		else if(n==3)
		{
			wt=rw*2.65;
		}
		else if(n==4)
		{
			wt=rw*1.17;
		}
		else if(n==5)
		{
			wt=rw*1.05;
		}
		else if(n==6)
		{
			wt=rw*1.23;
		}
		return wt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hey, Whats your weight?");
		double weight=scanner.nextDouble();
		System.out.println("1 (Venus)->0.78");
		System.out.println("2 (Mars)->0.39");
		System.out.println("3 (Jupiter)->2.65");
		System.out.println("4 (Saturn)->1.17");
		System.out.println("5 (Uranus)->1.05");
		System.out.println("6 (Neptune)->1.23");
		System.out.println("Select the planet");
		System.out.println("Please enter an integer(1-7)");
		int num=scanner.nextInt();
		System.out.println("Your relative weight would be "+relativeWeight(num,weight)+" pounds on that planet");
		
	}

}
