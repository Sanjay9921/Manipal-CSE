//Simulating ls command

#include<stdio.h>
#include<dirent.h>
#include<stdlib.h>

int main()
{
	char dirname[100];
	DIR* p;
	struct dirent *d;
	printf("\nenter directory name:\n");
	scanf("%s",dirname);
	p = opendir(dirname);
	if(p==NULL)
	{
		printf("\nCannot find directory...\n");
		exit(-1);
	}
	while(d=readdir(p))
		printf("%s\n",d->d_name);
	return 0;
}