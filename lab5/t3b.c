#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
	int status;
	int i=fork();
	if(i==0)
	{	
		exit(-1);
		printf("Child pid is: %d\n",(long)getpid);
		printf("Child ppid is: %d\n",(long)getppid);
	}
	else
	{
		wait(&status);
		if(WIFEXITED(status))
		{
			printf("Normal termination %d\n",WEXITSTATUS(status));
		}
		printf("Parent pid is: %d\n",(long)getpid);
		printf("Parent ppid is: %d\n",(long)getppid);
	}
	return 0;
}
