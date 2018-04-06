#include<stdio.h>
#include<unistd.h>

int main()
{
	printf("My Real user-ID is: %d\n",(long)getuid());
	printf("My effevtive user id is: %d\n",(long)geteuid());
	printf("My real group id is: %d\n",(long)getgid());
	printf("My effective group id is: %d\n",(long)getegid());
	return 0;
}

