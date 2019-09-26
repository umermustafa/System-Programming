package com.packages.main;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		String input=scanner.nextLine();
		int num=Integer.parseInt(input);
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
			
		}
		scanner.close();
	}

}
