#include<fcntl.h>
#include<stdlib.h>
int main()
{
	char buff[1024];
	close(1);
	int fd1=open("errorAndoutput.txt",O_CREAT|O_RDWR);
	int fd=dup2(fd1,2);
	if(fd<0)
	{
		perror("error");
	}
	int n;
	int file=open("/etc/passwd",O_RDONLY);
	for(;;)
	{
		n=read(file,buff,1023);
		if(n<=0)
		{
			break;
		}
		write(fd,buff,1023);
	}
	return 0;
}	 	
	
