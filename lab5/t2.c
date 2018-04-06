#include<stdio.h>
#include<unistd.h>
int main()
{
	uid_t ruid,euid,suid;
	gid_t rgid,egid,sgid;
	getresuid(&ruid,&euid,&suid);
	printf("My real user id is: %d\n",(long)ruid);
	printf("My effective user id is: %d\n",(long)euid);
	printf("My saved set user id is: %d\n",(long)suid);
	int rv=setuid(501);
	if(rv!=-1)
	{
		getresuid(&ruid,&euid,&suid);
		printf("After setuid(501) the ids are:\n");
		printf("My real user id is: %d\n",(long)ruid);
		printf("My effective user id is: %d\n",(long)euid);
		printf("My saved set user id is: %d\n",(long)suid);
	}
	else
	{
		printf("error in setting id\n");
	}
	return 0;gedit 
}
