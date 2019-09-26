package com.packages.second;

public class Cars_Buses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people=10,cars=15,buses=5;
		if(people<cars)
		{
			System.out.println("We should take the cars.");
		}
		else if(people>cars)
		{
			System.out.println("We should not take the cars.");
		}
		else
		{
			System.out.println("We can't decide.");
		}
		if(buses>cars)
		{
			System.out.println("That's too many buses");
		}
		else if(buses<cars)
		{
			System.out.println("May be we should take the buses");
		}
		else
		{
			System.out.println("We still can't decide.");
		}
		if(people>buses)
		{
			System.out.println("Alright.,let's just take the buses.");
		}
		else {
			System.out.println("Lets just take the cars.");
		}
	}

}
