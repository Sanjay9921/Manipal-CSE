#include<pthread.h>
#include<stdio.h>

void* thread_code(void* param)
{
	printf("\nIn thread code...\n");
}

int main()
{
	pthread_t thread;
	pthread_create(&thread,0,&thread_code,0);
	printf("\nIn main thread\n");
	pthread_join(thread,0);
}