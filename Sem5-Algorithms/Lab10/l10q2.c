//floyd's Algo
#include<stdio.h>
#include<stdlib.h>

#define MAX 100000

int min(int a,int b)
{
	return (a<b?a:b);
}

void FloydAlgo(int n,int adj[n][n])
{
	for(int k=0;k<n;k++)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				adj[i][j] = min(adj[i][j],(adj[i][k]+adj[k][j]));
			}
		}
	}
}



int main()
{
	int n;	
	printf("\n------------------------\n");	
	printf("\nEnter the number of vertices:\n");
	scanf("%d",&n);
	int adj[n][n];
	printf("\nEnter the directed weight matrix[i][j], for infinity use 100000: \n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			scanf("%d",&adj[i][j]);
		}
	}

	FloydAlgo(n,adj);

	printf("\nApplying floyd's algo to the adjacency matrix adj:\n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			printf("%d ",adj[i][j]);
		}
		printf("\n");
	}

	return 0;


}