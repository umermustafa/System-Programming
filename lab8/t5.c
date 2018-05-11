#include<stdlib.h>
int main(int argc,char* argv[]){
	if(argc!=2)
	{printf("Incorrect args");exit(1);}	
	if(access(argv[1],R_OK)==0)
		printf("You have read access");
	else
		printf("No Access");
	if(access(argv[1],R_OK|W_OK)==0)
		printf("Read and write access");
	else
		printf("No read and write acces");
	if(access(argv[1],X_OK)==0)
		printf("Execute access");
	else
		printf("No execute access");
	if(access(argv[1],F_OK)==0)
		printf("File exist");
	else
		printf("File does not exist");
	exit(0);
}
