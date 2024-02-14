#include<sys/types.h>
#include<unistd.h>
#include<stdio.h>
#include<stdlib.h>

int main()
{
	pid_t pid;
	char* msg;
	int n;
	printf("\nFork program starting...\n");
	pid = fork();

	printf("\nPid is: %d\n",getpid());
	switch(pid)
	{
		case -1:
		perror("\nFork Failed...\n");
		exit(1);

		case 0:
		printf("\nPid is: %d\n",getpid());
		msg = "\nDis Child process...\n";
		n = 5;
		break;

		default:
		printf("\nPid is: %d\n",getpid());
		msg = "\nDis Parent Process...\n";
		n = 3;
		break;
	}

	for(;n>0;n--)
	{
		puts(msg);
		sleep(1);
	}

	exit(0);
}