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
	int open_mode = O_RDONLY;
	char buffer[BUFFER_SIZE+1];
	memset(buffer, '\0', sizeof(buffer));

	pipe_fd = open(FIFO_NAME, open_mode);

	if(pipe_fd!=-1)
	{
		do
		{
			res = read(pipe_fd, buffer, BUFFER_SIZE);
		} while(res>0);

		puts(buffer);
		(void)close(pipe_fd);
	}
	else
	{
		exit(EXIT_FAILURE);
	}
	exit(EXIT_SUCCESS);
}