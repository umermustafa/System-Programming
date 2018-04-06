#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
	int i=fork();
	if(i==0)
	{
		printf("Child pid is: %d\n",(long)getpid);
		printf("Child ppid is: %d\n",(long)getppid);
	}
	else
	{
		wait(NULL);
		printf("Parent pid is: %d\n",(long)getpid);
		printf("Parent ppid is: %d\n",(long)getppid);
	}
	return 0;
}
