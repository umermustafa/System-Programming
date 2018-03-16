#include<stdio.h>
#include"myStrFunc.h"

int main()
{
	char *arr="abba";
	if(isPalindrome(arr,4)==1)
	{
		printf("Palindrome");
		
	}
	else
	{
		printf("Not a Palindrome");
	}
}
