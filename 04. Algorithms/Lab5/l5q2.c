#include <stdio.h>
#include <stdlib.h>

int G[100][100];

int V;

int iszero(int arr[100][100],int i)
{
    for(int j = 0;j < V;j++)
        if(arr[j][i]!=0)return 0;
    return 1;
}

int main () 
{
    printf("Enter no. of vertices: ");
    scanf(" %d", &V);
    printf("Enter adj. matrix:\n");

    for (int i = 0; i < V; ++i) 
        for (int j = 0; j < V; ++j) 
            scanf(" %d", &G[i][j]);

    int done = 0;
    int ndx = 0;
    int comp[V];

    for(int i = 0;i < V;i++)
        comp[i] = 0;

    while(done == 0)
    {
    for(int i = 0;i<V;i++)
    {
        if(iszero(G,i) && comp[i]==0)
        {
            comp[i] = 1;
            printf("Job %d\n",i);
            for(int j = 0;j<V;j++)
                G[i][j] = 0;
            ndx++;
        }
        if(ndx == V)
            done = 1;           
    }
}

    return 0;
}
