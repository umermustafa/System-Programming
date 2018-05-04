#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<fcntl.h>
int main()
{
	char buff [244];
	int n=0;
	n=read(0,buff,244);
	if(n<1)
	{
		exit(-1);
	}
	int fd=open("file.txt", O_CREAT|O_RDWR,0777);
	write(fd,buff,n);
	return 0;
}
 	
