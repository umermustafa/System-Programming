#include<stdio.h>
#include<setjmp.h>

void firstsetJump();
void havefun();
int i=0;
static jmp_buf envbuf;
int main()
{
	
	printf("This is main()\n");
	if ((i = setjmp(envbuf)) == 0)
	{
		printf("Value of i = %d\n", i);
		firstsetJump();
	}
	havefun();
	return 0;
	
}

void firstsetJump()
{
	printf("This is firstsetJump.");
	printf("Counter = %d" ,i);
	i++;
}
void havefun()
{
	printf("In have fun function.");
	printf("Counter = %d",i);
	i++;	
}
