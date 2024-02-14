#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<errno.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/msg.h>


struct my_msg_st
{
	long int my_msg_type;
	char some_text[BUFSIZ];
};

void isPalindrome(char str[])
{
	printf("\nYou wrote: %s\n",str);
	
	int n = strlen(str);
	int flag=0;
	
	for(int i=0;i<n;i++)
	{
		if(str[i]!=str[n-i-1])
		{
			printf("\nstr[i] is: %c\n",str[i]);
			printf("\nstr[n-i-1] is: %c\n",str[n-i-1]);
			flag=1;
			break;
		}
	}
    
	if(flag)
	{
		printf("\nNot a palidrome...\n");
	}
	else
	{
		printf("\nis a palindrome...\n");
	}

}

int main()
{
	int running=1;
	int msgid;
	struct my_msg_st some_data;
	long int msg_to_receive=0;
	msgid = msgget((key_t)1234,0666|IPC_CREAT);
	if(msgid==-1)
	{
		fprintf(stderr,"msgget failed with error: %d\n",errno);
		exit(EXIT_FAILURE);
	}
	while(running)
	{
		if(msgrcv(msgid,(void *)&some_data,BUFSIZ,msg_to_receive,0)==-1)
		{
			fprintf(stderr,"\nmsgrcv failed with error: %d\n",errno);
			exit(EXIT_FAILURE);
		}
		printf("\nYou wrote: %s\n",some_data.some_text);

		isPalindrome(some_data.some_text);

		if(strncmp(some_data.some_text,"end",3)==0)
		{
			running=0;
		}
	}

	if(msgctl(msgid,IPC_RMID,0)==-1)
	{
		fprintf(stderr,"msgctl(IPC_RMID) failed\n");
		exit(EXIT_FAILURE);
	}
	exit(EXIT_SUCCESS);
}