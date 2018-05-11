#include<stdlib.h>
int main(int argc,char* argv[]){
	int i;
	struct stat buf;
	char* ptr;
	if(argc!=2){
	fprint (stderr,"Incorrect number of arguments\n");
	exit(1);
	}
	if(lstat(argv[1],&buf)<0){
	perror("error in lstat");
	exit(1);
	}
	printf("%s",argv[1]);
	if(S_ISREG(buf.st_mode)) ptr=" is a file";
	else if(S_ISDIR(buf.st_mode)) ptr=" is a directory";
	printf("%s,ptr);
	return 0;
}
