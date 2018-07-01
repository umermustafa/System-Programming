#include<stdio.h>
#include<unistd.h>
#include<signal.h>

int main()
{ 
	sigset_t newset, oldset; 
	sigemptyset(&newset); 
	sigaddset(&newset, SIGINT); 
	sigaddset(&newset, SIGQUIT); 
	sigaddset(&newset, SIGHUP); 
	sigaddset(&newset, SIGKILL);
	sigaddset(&newset, SIGTSTP);
	sigaddset(&newset, SIGFPE);
	
	sigprocmask(SIG_SETMASK, &newset, &oldset); 

	int i = 0; 
	for(i=1; i<=10; i++)
	{ 
		printf("I am in a loop for about 10 seconds with new 			sigset which is masking sigint!\n"); 
		sleep(1); 
	} 

	sigprocmask(SIG_SETMASK, &oldset, NULL); 

	for(i=1; i<=10; i++){ 
		printf("I am in a loop for about 10 seconds, with the old sigset which is not masking sigint!\n"); 
		sleep(1); 
	} 
	return 0;
}
