#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<fcntl.h>
int main()
{
	char buff [244];
	int n=0;
	int fd=open("file.txt",O_RDONLY,0777);
	int fd1=open("newfile.txt",O_CREAT|O_RDWR,0777);
	n=read(fd,buff,244);
	if(n<1)
	{
		exit(-1);
	}
	write(fd1,buff,n);
	return 0;
}
 	
