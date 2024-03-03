#include<stdio.h>
#include<stdlib.h>
#define MAX 100
#define initial 1
#define visited 2
#define finished 3
int state[MAX];

void dfs(int v,int n,int arr[n][n])
{
	printf("\nThe vertice visited is: %d\n",v);
	state[v] = visited;
	for(int i=0;i<n;i++)
	{
		if(arr[v][i]==1 && state[i]==initial)
			dfs(i,n,arr);
	}

	state[v] = finished;
}

void dfs_traversal(int n,int arr[n][n])
{
	for(int i=0;i<n;i++)
		state[i] = initial;

	dfs(0,n,arr);
	for(int i=0;i<n;i++)
	{
		if(state[i]==initial)
			dfs(i,n,arr);
	}
	printf("\n");
}

int main()
{
	int v;
	printf("\nEnter the number of vertices:\n");
	scanf("%d",&v);

	int arr[v][v];

	printf("\nEnter the adjacent matrix:\n");
	for(int i=0;i<v;i++)
	{
		for(int j=0;j<v;j++)
		{
			scanf("%d",&arr[i][j]);
		}
	}

	dfs_traversal(v,arr);

}