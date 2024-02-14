#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void firstFit(int n,int m,int block1[],int process1[])
{
	//n = block size, m = process size
	int alloc[m];

	memset(alloc,-1,sizeof(alloc));

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(block1[j]>=process1[i])
			{
				alloc[i] = j;
				block1[j]-=process1[i];
				break;
			}
		}
	}

	printf("\nAlgo: First Fit:\n");
	for(int i=0;i<m;i++)
	{
		printf(" %d\t\t%d\t\t",i+1,process1[i]);
		if(alloc[i]!=-1)
			printf("%d\n",alloc[i]+1);
		else
			printf("Not allowed\n");

	}
}

void bestFit(int n,int m,int block2[],int process2[])
{
	//n = block size, m = process size
	int alloc[m];

	memset(alloc,-1,sizeof(alloc));

	for(int i=0;i<m;i++)
	{
		int best_fit = -1;
		for(int j=0;j<n;j++)
		{			
			if(block2[j]>=process2[i])
			{
				if(best_fit==-1)
					best_fit = j;
				else if(block2[best_fit]>block2[j])
					best_fit = j;
			}
		}

		if(best_fit!=-1)
		{
			alloc[i] = best_fit;
			block2[best_fit]-=process2[i];
		}
	}

	printf("\nAlgo: Best Fit:\n");
	for(int i=0;i<m;i++)
	{
		printf(" %d\t\t%d\t\t",i+1,process2[i]);
		if(alloc[i]!=-1)
			printf("%d\n",alloc[i]+1);
		else
			printf("Not allowed\n");

	}
}

void worstFit(int n,int m,int block3[],int process3[])
{
	int alloc[m];

	memset(alloc,-1,sizeof(alloc));
	for(int i=0;i<m;i++)
	{
		int worst_fit = -1;
		for(int j=0;j<n;j++)
		{
			if(worst_fit==-1)
				worst_fit = j;
			else if(block3[worst_fit]<block3[j])
				worst_fit = j;
		}

		if(worst_fit!=-1)
		{
			alloc[i] = worst_fit;
			block3[worst_fit]-=process3[i];
		}
	}

	printf("\nAlgo: Worst Fit:\n");
	for(int i=0;i<m;i++)
	{
		printf(" %d\t\t%d\t\t",i+1,process3[i]);
		if(alloc[i]!=-1)
			printf("%d\n",alloc[i]+1);
		else
			printf("Not allowed\n");

	}
}


int main()
{
	int block1[] = {100,500,200,300,600};
	int process1[] = {212,417,112,426};
	int block2[] = {100,500,200,300,600};
	int process2[] = {212,417,112,426};
	int block3[] = {100,500,200,300,600};
	int process3[] = {212,417,112,426};

	int n = sizeof(block1)/sizeof(block1[0]);
	int m = sizeof(process1)/sizeof(process1[0]);

	firstFit(n,m,block1,process1);

	bestFit(n,m,block2,process2);

	worstFit(n,m,block3,process3);

	return 0;
}