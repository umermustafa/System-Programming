#include<signal.h>
#include<stdio.h>
#include<unistd.h>
#include<signal.h>

int main()
{
	signal(SIGTSTP,SIG_IGN);
	while(1)
	{
		printf("I am in an infinite loop\n");
		printf("You can't kill me by SIGTSTP \n");
		sleep(2);
	}
	return 0;
}
