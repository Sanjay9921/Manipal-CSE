#include<stdio.h>
#include<stdlib.h>

typedef struct bankers_algorithm
{
	int id;
	int check;
	int alloc[3];
	int max[3];
	int need[3];

}bankers;


int main()
{
	int n;
	printf("\nEnter the number of processes:\n");
	scanf("%d",&n);

	bankers proc[n];

	int avail[3];

	int res[n];
	printf("Enter available details:\n");
	for(int i=0;i<3;i++)
	{
		scanf("%d",&avail[i]);
	}

	printf("\nInitiation of the input processes...\n");
	for(int i=0;i<n;i++)
	{
		proc[i].id = i;
		proc[i].check = 0;
		printf("\nEnter Allocation for process %d: \n",i);
		for(int j=0;j<3;j++)
		{
			scanf("%d",&proc[i].alloc[j]);
		}

		printf("\nEnter Max for process %d: \n",i);
		for(int j=0;j<3;j++)
		{
			scanf("%d",&proc[i].max[j]);
		}

		//step1: computing the need matrix
		for(int j=0;j<3;j++)
		{
			proc[i].need[j] = proc[i].max[j] - proc[i].alloc[j];
		}
	}

	printf("\nTest for need matrix:\n");
	for(int i=0;i<n;i++)
	{
		printf("\nProcess %d: \n",i);
		for(int j=0;j<3;j++)
		{
			printf("%d ",proc[i].need[j]);
		}
		printf("\n");
	}
	printf("\n----------------------------------------------\n");

	//step2: compare the avail to need

	int k=0;
	int resum=0;

	while(resum<n)
	{
		for(int i=0;i<n;i++)
		{
			printf("\nCheck: for process %d -> \n",i);
			int sum=0;
			for(int j=0;j<3;j++)
			{
				if(avail[j]>=proc[i].need[j])
				{
					sum+=1;
				}
			}
			if(sum==3&&proc[i].check==0)
			{
				for(int j=0;j<3;j++)
				{
					avail[j]+=proc[i].alloc[j];
				}

				res[k++] = i;
				resum++;
				proc[i].check = 1;
			}
			else
			{
				continue;
			}
		}

		printf("\nresum is: %d\n",resum);
	}
	

	printf("\nthe Safe Sequence is: \n");
	for(int i=0;i<n;i++)
	{
		printf("%d ",res[i]);
	}
	printf("\n");

	return 0;
}