#include<stdio.h>
int isEqual(int a,int b)
{
	if(a==b)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}

void swap(int a,int b)
{
	int t;
	t=a;
	a=b;
	b=t;
	printf("x= %d \n",a);
	printf("y= %d \n",b);

}
	
