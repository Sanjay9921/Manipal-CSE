#include<stdio.h>
#include<stdlib.h>

typedef struct deadlock_detection
{
	int id;
	int check;
	int alloc[3];
	int req[3];
}ddlck;

int main()
{
	int n;
	printf("\nEnter the number of processes:\n");
	scanf("%d",&n);

	ddlck proc[n];

	int avail[3];

	printf("\nEnter avail:\n");
	for(int i=0;i<3;i++)
	{
		scanf("%d",&avail[i]);
	}

	printf("\nInput initiation for the processes...\n");
	for(int i=0;i<n;i++)
	{
		proc[i].id = i;
		proc[i].check = 0;
		printf("\nEnter details for the process %d:\n",i);
		printf("\nEnter alloc:\n");
		for(int j=0;j<3;j++)
		{
			scanf("%d",&proc[i].alloc[j]);
		}

		printf("\nEnter request:\n");
		for(int j=0;j<3;j++)
		{
			scanf("%d",&proc[i].req[j]);
		}

	}

	int resum=0;
	int res[n];
	int k=0;
	while(resum<n)
	{
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				if(proc[i].req[j]<=avail[j])
					sum++;
			}
			if(sum==3&&proc[i].check==0)
			{
				for(int j=0;j<3;j++)
				{
					avail[j]+=proc[i].alloc[j];
				}
				res[k++] = i;
				resum++;
				proc[i].check=1;
			}
			else
				continue;
		}
	}

	printf("\nThe safe sequence is:\n");
	for(int i=0;i<n;i++)
	{
		printf("%d ",res[i]);
	}

	printf("\n");

	return 0;
}