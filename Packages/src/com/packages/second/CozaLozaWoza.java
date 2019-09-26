package com.packages.second;

public class CozaLozaWoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=0;
		for(int i=1;i<=110;i++)
		{
			line++;
			if(i%3==0)
			{
				if(i%5==0)
				{
					System.out.print("CozaLoza ");;
				}
				else if(i%7==0)
				{
					System.out.print("CozaWoza ");;
				}
				else
				{
					System.out.print("Coza ");
				}
				if(line%11==0) //Goes to next line after 11 words
				{
					System.out.println();
				}
				
			}
			else if(i%5==0)
			{
				if(i%3==0)
				{
					System.out.print("CozaLoza ");
				}
				else
				{
					System.out.print("Loza ");
				}
				if(line%11==0)
				{
					System.out.println();
				}
			}
			else if(i%7==0)
			{	
				if(i%3==0)
				{
					System.out.print("CozaWoza ");
				}
				else
				{
					System.out.print("Woza ");
				}
				
				if(line%11==0)
				{
					System.out.println();
				}
			}
			
			
			else {
				System.out.print(i+" ");
				if(line%11==0)
				{
					System.out.println();
				}
			}
			
			
		}
	}

}
