#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main()
{
	pid_t pid;

	pid = fork();
	if(pid<0)
	{
		fprintf(stderr, "\nFork failed...\n");
		exit(-1);
	}
	else if(pid==0)
	{
		execlp("/bin/ls","ls",NULL);
	}
	else
	{
		wait(NULL);
		printf("\nChild process complete...\n");
		exit(0);
	}
}