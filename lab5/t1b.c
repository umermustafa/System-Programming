#include<stdio.h>
#include<unistd.h>
int main()
{
	uid_t ruid ,euid,suid;
	gid_t rgid,egid,sgid;
	getresuid(&ruid,&euid,&suid);
	printf("My real user id is: %d\n",(long)ruid);
	printf("My effective user id is: %d\n",(long)euid);
	printf("My saved set user id is: %d\n",(long)suid);
	getresgid(&rgid,&egid,&sgid);
	printf("My real group id is: %d\n",(long)rgid);
	printf("My effective group is: %d\n",(long)egid);
	printf("My saved set group id is: %d\n",(long)sgid);
	return 0;
}	
