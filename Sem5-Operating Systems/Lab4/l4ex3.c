#include<sys/types.h>
#include<sys/wait.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>


void main()
{
	int status;
	pid_t pid;
	pid = fork();

	printf("\nPid of this process is: %d\n",getpid());

	if(pid==-1)
		printf("\nError: child not created...\n");
	else if(pid==0)
	{
		printf("\nAm a child bruh...\n");
		printf("\nSimba process\n");
		printf("\nPid of this process is: %d\n",getpid());
		exit(0);
	}
	else
	{
		wait(&status);//causes the parent to sleep while the child process has completed execution
		printf("\nAm the parent bruh...\n");
		printf("\nMufasa process\n");
		printf("\nPid of this process is: %d\n",getpid());
		printf("\nChild returned: %d\n",status);
	}
}