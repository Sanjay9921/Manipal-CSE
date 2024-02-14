#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
	int key;
	struct node *lchild;
	struct node *rchild;
}NODE;

NODE* insert(NODE* root,int key)
{
	NODE* temp;	
	if(root==NULL)
	{
		temp = (NODE*)malloc(sizeof(NODE));
		temp->key = key;
		temp->lchild = temp->rchild = NULL;
		root = temp;
	}
	else if(key>root->key)
	{
		root->rchild = insert(root->rchild,key);
	}
	else if(key<root->key)
	{
		root->lchild = insert(root->lchild,key);
	}
	else
	{
		printf("\nDuplicate Node...Please try again.\n");
		exit(0);
	}
	return root;
}

int max(int a,int b)
{
	return (a>b?a:b);
}

int height(NODE* root)
{
	if(root==NULL)
	{
		return 1;
	}
	else
	{
		int lheight = height(root->lchild);
		int rheight = height(root->rchild);

		return (max(lheight,rheight)+1);
	}
}

void printGivenLevel(NODE* root,int l)
{
	if(root==NULL)
		return;
	else if(l==1)
	{
		int h = height(root->lchild)-height(root->rchild);
		printf("%d ( %d )\t",root->key,h);
	}
	else if(l>1)
	{
		printGivenLevel(root->lchild,l-1);
		printGivenLevel(root->rchild,l-1);
	}
}

void printLevel(NODE* root)
{
	int h = height(root)-1;
	for(int i=1;i<=h;i++)
	{
		printGivenLevel(root,i);
	}
	printf("\n");
}

int main()
{
	NODE* root = NULL;
	int choice;
	int key;
	while(1)
	{
		printf("\n1. Insert 2. Quit \n");
		scanf("%d",&choice);

		if(choice==1)
		{
			printf("\nEnter key:\n");
			scanf("%d",&key);
			root = insert(root,key);
		}
		else
		{
			break;
		} 
	}

	printf("\nThe height of the tree is: %d\n",height(root)-1);

	printf("\nLevel Order Traversal of the tree:\n");

	printLevel(root);

	return 0;
}