#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 

struct Edge 
{ 
    int src, dest, weight; 
}; 
  

struct Graph 
{ 
    int V, E;  
    struct Edge* edge; 
}; 
  

struct Graph* createGraph(int V, int E) 
{ 
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph)); 
    graph->V = V; 
    graph->E = E; 
  
    graph->edge = (struct Edge*)malloc(sizeof(struct Edge)); 
  
    return graph; 
} 
  
struct subset 
{ 
    int parent; 
    int rank; 
}; 
  

int find(struct subset subsets[], int i) 
{ 
    if (subsets[i].parent != i) 
        subsets[i].parent = find(subsets, subsets[i].parent); 
  
    return subsets[i].parent; 
} 
   
void Union(struct subset subsets[], int x, int y) 
{ 
    int xroot = find(subsets, x); 
    int yroot = find(subsets, y); 
  
    
    if (subsets[xroot].rank < subsets[yroot].rank) 
        subsets[xroot].parent = yroot; 
    else if (subsets[xroot].rank > subsets[yroot].rank) 
        subsets[yroot].parent = xroot; 
  
    
    else
    { 
        subsets[yroot].parent = xroot; 
        subsets[xroot].rank++; 
    } 
} 
  

int myComp(const void* a, const void* b) 
{ 
    struct Edge* a1 = (struct Edge*)a; 
    struct Edge* b1 = (struct Edge*)b; 
    return a1->weight > b1->weight; 
} 
  
 
void KruskalMST(struct Graph* graph) 
{ 
    int V = graph->V; 
    struct Edge result[V]; 
    int e = 0;   
    int i = 0; 
  
    qsort(graph->edge, graph->E, sizeof(graph->edge[0]), myComp); 
  
    struct subset *subsets = (struct subset*) malloc( V * sizeof(struct subset) ); 
 
    for (int v = 0; v < V; ++v) 
    { 
        subsets[v].parent = v; 
        subsets[v].rank = 0; 
    } 
  
 
    while (e < V - 1 && i < graph->E) 
    { 
        struct Edge next_edge = graph->edge[i++]; 
  
        int x = find(subsets, next_edge.src); 
        int y = find(subsets, next_edge.dest);
        printf("\nx and y: %d %d \n",x,y);  
        if (x != y) 
        { 
            result[e++] = next_edge; 
            Union(subsets, x, y); 
        } 
    } 
    printf("\n----------Kruskal Algo vertices are:---------------\n");
    printf("S | D | W\n");
    for (i = 0; i < e; ++i) 
        printf("%d | %d | %d\n", result[i].src, result[i].dest,result[i].weight); 
    printf("\n");
    return; 
} 
  
// Driver program to test above functions 
int main() 
{ 
    int V,E;
    printf("\nEnter the number of vertices V:\n");
    scanf("%d",&V);

    printf("\nEnter the number of edges E:\n");
    scanf("%d",&E);

    struct Graph* gph = createGraph(V,E);
    int src,dest,weight;

    for(int i=0;i<E;i++)
    {
        printf("\nEnter src for edge [%d]:\n",i);
        scanf("%d",&src);

        printf("\nEnter destn for edge [%d]:\n",i);
        scanf("%d",&dest);

        printf("\nEnter weight for edge [%d]:\n",i);
        scanf("%d",&weight);

        gph->edge[i].src = src;
        gph->edge[i].dest = dest;
        gph->edge[i].weight = weight;
    }
  
    KruskalMST(gph); 
  
    return 0; 
} 
