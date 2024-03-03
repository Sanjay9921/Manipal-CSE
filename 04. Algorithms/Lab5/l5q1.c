#include<stdio.h>
#include<stdlib.h>

int G[20][20],visited[20],V;
int store[20];

static int idx=1;

void dfs(int v)
{
  int i;
  visited[v]=1;
  for (i=1;i<=V;i++)
    if(G[v][i] && !visited[i])
    {
    	   dfs(i);
    }
      store[idx]=v;
      idx++;
}

int main()
{
  int i,j,count=0;
  printf("Enter number of vertices:\n");
  scanf("%d",&V);

  for (i=1;i<=V;i++)
  {
    visited[i]=0;
    for (j=1;j<=V;j++)
    	G[i][j]=0;
  }

  printf("Enter the adjacency matrix:\n");
  for (i=1;i<=V;i++)
    for (j=1;j<=V;j++)
    	scanf("%d",&G[i][j]);

  for(i=1;i<=V;i++)
  {
    if(!visited[i])
      dfs(i);
  }

  printf("Topological sort\n");

  for(int i=V;i>=1;i--)
    printf("%d\t",store[i]);

  return 0;
}