#include<stdio.h>
#include<stdlib.h>

int count=0;
int opcount=0;

typedef struct node
{
	int item;
	struct node *lchild;
	struct node *rchild;
}NODE;


int countNodes(NODE* root)
{
	opcount++;
	if(root==NULL)
		return 1;
	int lcnt = countNodes(root->lchild);
	int rcnt = countNodes(root->rchild);
	return lcnt+rcnt;
}

NODE* insertKey(NODE* root,int key)
{
	root = (NODE*)malloc(sizeof(NODE));
	root->item = key;
	root->rchild = root->lchild = NULL;
	return root;
}

int main()
{
	NODE* root=NULL;
	root = insertKey(root,1);
	root->lchild = insertKey(root->lchild,2);
	root->rchild = insertKey(root->rchild,3);
	root->lchild->rchild = insertKey(root->lchild->rchild,4);
	root->rchild->lchild = insertKey(root->rchild->lchild,5);
	root->rchild->rchild = insertKey(root->rchild->rchild,6);
	root->lchild->rchild->lchild = insertKey(root->lchild->rchild->lchild,7);

	printf("\nThe number of nodes in the binary tree: %d\n",countNodes(root)-1);
	printf("\nThe opcount is: %d\n",opcount);

	return 0;
	
}