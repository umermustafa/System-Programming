package com.packages.conditional2;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input an alphabet");
		char alph;
		String alpha=scanner.nextLine();
		if(alpha.length()>1)
		{
			System.out.println("Error");
		}
		else {
			alph=alpha.charAt(0);
				if(alph>='a' && alph<='z' || alph>='A' && alph<='Z')
				{
					if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u'|| alph=='A' || alph=='E' || alph=='I' || alph=='O' || alph=='U')
					{
						System.out.println("Input letter is Vowel");
					}
					else
					{
						System.out.println("Input letter is consonant");
					}
					
				}
				else
				{
					System.out.println("Error");
				}
			}
		
		
	}

}
