//Warshal's algo
#include<stdio.h>
#include<stdlib.h>

int opcount = 0;
void WarshallAlgo(int n,int adj[n][n])
{
	for(int k=0;k<n;k++)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				opcount++;
				adj[i][j] = (adj[i][j]) | ((adj[i][k]) & (adj[k][j]));
			}
		}
	}
}



int main()
{
	int n;
	printf("\n------------------------\n");	
	printf("\nEnter the number of vertices (n):\n");
	scanf("%d",&n);
	int adj[n][n];
	printf("\nEnter the directed adj matrix adj[i][j]: \n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			scanf("%d",&adj[i][j]);
		}
	}

	WarshallAlgo(n,adj);

	printf("\n------------------------\n");	

	printf("\nApplying Warshal's algo to the adjacency matrix adj:\n");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			printf("%d ",adj[i][j]);
		}
		printf("\n");
	}

	printf("\n------------------------\n");	
	printf("\nOpcount is: %d\n",opcount);

	return 0;


}