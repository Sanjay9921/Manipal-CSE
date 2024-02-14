#include<stdio.h>
#include<stdlib.h>

int opcount=0;

void swap(int *a,int *b)
{
	int c = *a;
	*a = *b;
	*b = c;
}

void topDownShift(int arr[],int begin,int end)
{
	int x = end;
	while(x>begin)
	{
		int t = x/2;
		if(arr[t]<arr[x])
		{
			opcount++;
			swap((arr+t),(arr+x));
			x = t;
		}
		else
			return;
	}
}

void heapify(int arr[],int cnt)
{
	int end = 1;
	printf("\n_______________Iteration Count: %d_____________\n",cnt);
	printf("\nBefore Heapified: ");
	for(int i=1;i<=cnt;i++)
	{
		printf("%d ",*(arr+i));
	}
	printf("\n");

	while(end<=cnt)
	{
		topDownShift(arr,1,end);
		end+=1;
	}

	printf("\nArray contains: ");
	for(int i=1;i<end;i++)
	{
		printf("%d ",*(arr+i));
	}
}

int main()
{
	int n;
	printf("\nEnter number of elements: \n");
	scanf("%d",&n);

	int *arr = (int*)calloc(n+1,sizeof(int));
	printf("\nEnter elements:\n");
	for(int i=1;i<=n;i++)
	{
		scanf("%d",(arr+i));
		if(i==1)
		{
			printf("\n_______________Iteration Count: %d_____________\n",1);
			printf("\nArray contains: %d\n",*(arr+i));
		}
		else if(i>1)
		{
			heapify(arr,i);
		}
	}

	printf("\nThe heapified elements are: \n");
	for(int i=1;i<=n;i++)
	{
		printf("%d\t",*(arr+i));
	}

	printf("\n");

	printf("\n Opcount is: %d \n",opcount);

	return 0;

}
