#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

typedef struct round_robin
{
	int id;
	int at;
	int bt;
	int ft;
	int tat;
	int wt;
}rr;

double avg_wt=0.0;
double avg_tat=0.0;

rr *dataset;

void inputData()
{
	int n;
	printf("\nEnter the number of processess: \n");
	scanf("%d",&n);

	dataset = (rr**)calloc(n,sizeof(rr*));

	for(int i=0;i<n;i++)
	{
		*(dataset+i) = (rr*)malloc(sizeof(rr));

		rr* data = *(dataset+i);

		printf("\n")
	}
}