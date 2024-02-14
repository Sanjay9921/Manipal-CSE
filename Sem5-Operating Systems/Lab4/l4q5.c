#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<sys/stat.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
	char *str = (char*)malloc(65536*sizeof(char));
	printf("\nWrite anything...\n");
	fgets(str,65536,stdin);

	int l = strlen(str);

	int fp = open("file.txt", O_CREAT | O_RDWR | O_APPEND, 0666);
	if(write(fp,str,l)!=l)
		printf("\nError writing to the file\n");

	close(fp);

	return 0;

}