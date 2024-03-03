//Knapsack problem
#include<stdio.h>
#include<stdlib.h>

int max(int a,int b)
{
	return (a>b?a:b);
}

int KnapsackAlgo(int W,int weight[],int val[],int n)
{
	if(n==0||W==0)
		return 0;

	if(weight[n-1]>W)
		return KnapsackAlgo(W,weight,val,n-1);
	else
		return max((val[n-1]+KnapsackAlgo(W-weight[n-1],weight,val,n-1)),KnapsackAlgo(W,weight,val,n-1));
}

int main()
{
	int W;
	printf("\n------------------------\n");	
	printf("\nEnter Capacity(W):\n");
	scanf("%d",&W);

	int n;
	printf("\nEnter the number of items:\n");
	scanf("%d",&n);

	int weight[n],val[n];
	printf("\nEnter weighted array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&weight[i]);
	}
	printf("\nEnter val array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&val[i]);
	}

	int res = KnapsackAlgo(W,weight,val,n);
	printf("\nThe maximum cost is: %d\n",res);

	return 0;
}