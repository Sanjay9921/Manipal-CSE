#include <stdio.h>
#include <stdlib.h>

int g[100][100];

int V;

int visited[100];

void dfsv(int v) 
{
	printf("Visiting %d\n", v);
	visited[v] = 1;
	int i;
	for (i = 0; i < V; ++i) {
		if (!(visited[i]) && (g[v][i] == 1) && (i != v)) {
			dfsv(i);
		}
	}
}

void dfs()
{
	int i;
	for (i = 0; i < V; ++i) {
		if (!visited[i]) {
			dfsv(i);
		}
	}
}

int main ()
{
	printf("Enter no of vertices: ");
	scanf(" %d", &V);
	int i, j;
	printf("Enter adj matrix: ");
	for (i = 0; i < V; ++i) {
		for (j = 0; j < V; ++j) {
			scanf(" %d", &g[i][j]);
		}
	}
	dfs();
	return 0;
}

