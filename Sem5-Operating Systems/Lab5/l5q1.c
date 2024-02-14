#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

void* child_thread(void* param)
{
	int n = (int)param;
	int fib[n];
	int first=0,next=1;
	fib[0] = first;
	fib[1] = next;
	int sum,count=0,k=2;
	while(count<n-1)
	{
		
	}


}