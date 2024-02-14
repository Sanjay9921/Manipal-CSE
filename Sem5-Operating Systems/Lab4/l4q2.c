#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main() {
	pid_t pid = fork();
	int status;
	if (pid == 0) {
		printf("\nIn child process...\n");
		execl("./",(char*)0);
		sleep(2);
	} else {
		while(wait(&status) != pid);
		printf("\nParent process here...\n");
	}
	return 0;
}