#include <stdio.h>
#include <stdlib.h>

typedef struct AdjNode {
	int vertex;
	struct AdjNode *next;
} NODE, *PNODE;

typedef struct AdjListNode {
	int count;
	PNODE head;
} LIST, *PLIST;

PNODE createAdjNode (int value) {
	PNODE adjNode = (PNODE)malloc(sizeof(NODE));
	adjNode->vertex = value;
	adjNode->next = NULL;
	return adjNode;
}

PLIST createAdjListNode () {
	PLIST adjListNode = (PLIST)malloc(sizeof(LIST));
	adjListNode->count = 0;
	adjListNode->head = NULL;
	return adjListNode;
}

void insertAdjNode (PNODE *head, int value) {
	if (*head == NULL) {
		*head = createAdjNode(value);
		return;
	}
	PNODE temp = *head;
	while (temp->next != NULL)
		temp = temp->next;
	temp->next = createAdjNode(value);
}

PLIST * inputAdjList (int v) {
	
	int i, vertex;

	PLIST *list = (PLIST *)calloc(v, sizeof(PLIST));
	
	PLIST temp;
	for (i = 0; i < v; ++i) {
		*(list + i) = createAdjListNode();
		temp = *(list + i);
		printf("\n\tVertex %d, Enter the connected vertices (1 - %d),Enter  0 to break: ", i+1, v);
		do {
			scanf(" %d", &vertex);
			if (vertex != 0)
				insertAdjNode(&temp->head, vertex);
		} while (vertex != 0);
	}
	
	return list;
}

void printAdjList (PLIST *list) {
	int i = 0;
	PLIST temp = *(list + i);
	while (temp != NULL) {
		printf("\n\t %d | ", i+1);
		temp = *(list + i);
		PNODE p = temp->head;
		while (p->next != NULL) {
			printf(" %d ->", p->vertex);
			p = p->next;
		}
		printf(" %d ", p->vertex);
		temp = *(list + (++i));
	}
}

int ** inputAdjMatrix (int v) {
	int i, j, vertex;
	int ** mat = (int **)calloc(v, sizeof(int *));
	for (i = 0; i < v; ++i) {
		*(mat + i) = (int *)calloc(v, sizeof(int));
		for (j = 0; j < v; ++j) {
			*(*(mat + i) + j) = 0;
		}
	}
	for (i = 0; i < v; ++i) {
		printf("\n\tVertex %d, Enter the connected vertices (1 - %d),Enter  0 to break: ", i+1, v);
		do {
			scanf(" %d", &vertex);
			if (vertex != 0) {
				*(*(mat + i) + vertex) = 1;
			}
		} while (vertex != 0);
	}
	return mat;
}

void printAdjMatrix (int ** mat, int v) {
	int i, j;
	for (i = 0; i < v; ++i) {
		printf("\n\t %d | ", i+1);
		for (j = 0; j < v; ++j) {
			if (*(*(mat + i) + j))
				printf(" %d  ", j);
		}
	}
}

int main (int argc, const char * argv []) {

	int v, e;
	printf("\tEnter number of vertices: ");
	scanf(" %d", &v);
	printf("\t   Enter number of edges: ");
	scanf(" %d", &e);

	if (e > v) {
		printf("\n\tUsing list representation.\n");
		PLIST *list = inputAdjList(v);
		printAdjList(list);
	} else {
		printf("\n\tUsing matrix representation.\n");
		int ** mat = inputAdjMatrix(v);
		printAdjMatrix(mat, v);
	}

	printf("\n\n");

	return 0;
}