#include<stdio.h>
#include<string.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<stdlib.h>
#include<unistd.h>
#include<limits.h>
#define BUFFER_SIZE PIPE_BUF
#define FIFO_NAME "/tmp/my_fifo"


int main()
{
	int pipe_fd;
	int res;
	int open_mode = O_WRONLY;
	char buffer[BUFFER_SIZE+1];
	if(access(FIFO_NAME, F_OK)==-1)
	{
		res = mkfifo(FIFO_NAME,0777);
		if(res!=0)
			exit(EXIT_FAILURE);
	}

	printf("Enter 4 integers \n");
	pipe_fd = open(FIFO_NAME, open_mode);

	if(pipe_fd!=-1)
	{
		gets(buffer);
		res = write(pipe_fd, buffer, BUFFER_SIZE);
		(void)close(pipe_fd);
	}
	else
	{
		exit(EXIT_FAILURE);
	}
	exit(EXIT_SUCCESS);
}
