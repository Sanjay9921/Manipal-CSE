#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>//read,write,pipe -> mostly for file

int main()
{
	int n;
	int fd[2];
	char buf[1025];
	char* data = "hello...this is sample data";
	pipe(fd);
	write(fd[1],data,strlen(data));
	if((n=read(fd[0],buf,1024))>0)
	{
		buf[n] = 0; //terminate the string
		printf("\nRead %d bytes from the pipe: %s\n",n,buf);
	}
	else
	{
		perror("\nRead\n");
	}

	exit(0);
}