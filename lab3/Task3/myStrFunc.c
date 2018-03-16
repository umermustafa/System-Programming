int isPalindrome(char *arr,int size)
{
	int st;
	int i=0;
	for(i=0;i<size;i++)
	{
		if(arr[i]==arr[size-1-i])
		{
			st=1;
		}
		else
		{
			st=-1;
			break;
		}
	}
	if(st==1)
	{
		return 1;
	}	
	else
	{
		return -1;
	}
}
