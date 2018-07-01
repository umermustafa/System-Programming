#include<signal.h>
#include<stdio.h>
#include<unistd.h>
#include<signal.h>

int main()
{
	signal(SIGINT,SIG_IGN);
	while(1)
	{
		printf("I am in an infinite loop\n");
		printf("You can't kill me by SIGINT i.e. by pressing 			ctrl+c\n");
		sleep(2);
	}
	return 0;
}
