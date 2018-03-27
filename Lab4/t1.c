#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i;
	int size=10;
	int* arr=(int*) malloc (sizeof(int)* size);
	for(i=0;i<size;i++)
	{
		arr[i]=size-i;
	}
	for(i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
	int newsize=size*2;	
	int *nptr=(int*) realloc (arr,sizeof(int)*newsize);
	for(i=0;i<newsize;i++)
	{
		nptr[i]=newsize-i;
	}	
	for(i=0;i<newsize;i++)
	{
		printf("%d ",nptr[i]);
	}
	free(nptr);
	return 0;
}	
	

