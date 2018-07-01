#include<stdio.h>
#include<unistd.h>
#include<signal.h>

int main()
{ 
	signal(SIGFPE, SIG_IGN); 
	printf("I'm going to divide a number with zero\n"); 
	sleep(1); 
	float ans = 54.5/0;  
	while(1);
	raise(SIGFPE); 
	printf("I am still running after a division by zero because I 		have ignored the signal\n"); 
	return 0; 
} 
