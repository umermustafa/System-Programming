#include<fcntl.h>
#include<stdlib.h>
int main()
{
	char buff[1024];
	int fd1=open("f1.txt",O_RDWR|O_CREAT,0777);
	dup2(1,2);
	int fd2=open("f2.txt",O_WRONLY|O_CREAT,0777);	
	dup2(fd2,1);			
	if(fd1 < 0)
	{
		perror("error");
				
	}
	int n;
	for(;;)
	{
		n=read(fd1, buff, 1023);
		if(n<=0)
		{
			break;
		}
		write(fd2,buff,n);
	}
	return 0;
}	 	
	
