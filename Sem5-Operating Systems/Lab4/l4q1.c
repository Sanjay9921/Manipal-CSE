#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main() {
	pid_t pid = fork();
	int status;
	if (pid == 0) {
		printf("\nLab1\n");
		printf("\nIn child process...\n");
		printf("\nstatus: %d\n",status);
		sleep(2);
	} else {
		while(wait(&status) != pid);
		printf("\nLab1\n");
		printf("\nParent process here...\n");
		printf("\nstatus: %d\n",status);
	}
	return 0;
}