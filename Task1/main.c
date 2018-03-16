#include<stdio.h>
#include"myMathFunc.h"

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
	

	return 0;
}
