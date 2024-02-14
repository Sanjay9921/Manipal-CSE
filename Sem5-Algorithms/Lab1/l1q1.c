#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
	int data;
	struct Node *lchild,*rchild;

}NODE;

//Insert a node with root as no child
NODE* insert(int data)
{
	NODE* node = (NODE*)malloc(sizeof(NODE));
	node->data = data;
	node->lchild = node->rchild = NULL;
	return node;
}

//Insert a new node
NODE* insertNODE(NODE* root, int data)
{
	if(root==NULL)
		return insert(data);

	if(data<root->data)
		root->lchild = insertNODE(root->lchild,data);

	else if(data>root->data)
		root->rchild = insertNODE(root->rchild,data);

	return root;
}

NODE* buildTREE()
{
	int data;
	NODE* root = NULL;
	printf("\n Insert Binary search key: \n");
	do
	{
		printf("\n Enter data or Enter -1 to break\n");
		scanf("%d", &data);
		if(data!=-1)
		{
			if(root==NULL)
				root = insert(data);
			else
				insertNODE(root,data);
		}
	}while(data!=-1);



	return root;
}

void preorder(NODE* root)
{
	if(root!=NULL)
	{
		printf("%d\t", root->data);
		preorder(root->lchild);
		preorder(root->rchild);
	}
}

void inorder(NODE* root)
{
	if(root!=NULL)
	{
		inorder(root->lchild);
		printf("%d\t",root->data);
		inorder(root->rchild);
	}
}

void postorder(NODE* root)
{
	if(root!=NULL)
	{
		postorder(root->lchild);
		postorder(root->rchild);
		printf("%d\t",root->data);
	}
}

NODE* searchKEY(NODE* root,int data)
{
	if(root==NULL)
		return NULL;

	if(data<root->data)
		return searchKEY(root->lchild,data);
	else if(data>root->data)
		return searchKEY(root->rchild,data);

	return root;
}


int main()
{
	int choice;

	NODE* root = buildTREE();

	do
	{
		printf("\n-------------------Choose bruh---------------------\n");
		printf("\n1. Search\n");
		printf("\n2. Preorder\n");
		printf("\n3. Inorder\n");
		printf("\n4. Postorder\n");
		printf("\n5. Quit\n");
		scanf("%d",&choice);
		if(choice==1)
		{
			int key;
			printf("\nEnter a key to be searched:\n");
			scanf("%d",&key);
			NODE* check = searchKEY(root,key);
			if(check==NULL)
			{
				printf("\nKey not found, hence, inserting it into the binary search tree.\n");
				insertNODE(root,key);
			}
			else
			{
				printf("\nKey is found\n");
			}

		}
		else if(choice==2)
		{
			printf("\nThis is the preorder traversal\n");
			preorder(root);
		}
		else if(choice==3)
		{
			printf("\nThis is the inorder traversal\n");
			inorder(root);
		}
		else if(choice==4)
		{
			printf("\nThis is the postorder traversal\n");
			postorder(root);
		}

	}while(choice!=5);


	return 0;

}
















