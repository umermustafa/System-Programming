#include<stdio.h>
#include"myMathFunc.h"
#include"myStrFunc.h"

int main()
{
	int a=2;
	int b=2;
	int c=3;
	if(isEqual(a,b))
	{
		printf("Equal numbers \n");
	}
	else
	{
		printf("Not equal \n");
	}
	swap(a,c);
	char *arr="abba";
	if(isPalindrome(arr,4)==1)
	{
		printf("Palindrome");
		
	}
	else
	{
		printf("Not a Palindrome");
	}
	return 0;
}
