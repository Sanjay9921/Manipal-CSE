#include<stdio.h>
#include<stdlib.h>

int step=0,step2=0,opcount=0;

void swap(int *a,int *b)
{
	int c = *a;
	*a = *b;
	*b = c;
}

void heapify(int n,int arr[])
{
	
	int i,j,k,v,heap;
	for(i=(n/2);i>=1;i--)
	{
		k = i;
		v = arr[k];
		heap = 0;
		while(heap==0&&2*k<=n)
		{
			j=2*k;
			if(j<n)
			{
				if(arr[j]<arr[j+1])
				{
					j+=1;
				}
				if(v>=arr[j])
				{
					heap=1;
				}
				else
				{
					arr[k] = arr[j];
					k = j;
				}
			}
		}
		arr[k] = v;
		printf("\nStep: [%d]\n",step);
		for(int i=1;i<=n;i++)
		{
			printf("%d ",arr[i]);
		}
		step++;
		printf("\n");
	}
	return;
}

void heapSort(int n,int arr[])
{
	int k=n;
	while(k>=1)
	{
		int max = arr[1],index = 1;
		for(int i=1;i<=k;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
				index = i;
			}
		}
		swap(&arr[index],&arr[k]);

		printf("\nMax deletions -> Step[%d]\n",step2);
		for(int i=1;i<=k;i++)
		{
			if(i==k-1)
			{
				printf("%d|",arr[i]);
			}
			else
				printf("%d",arr[i]);
		}
		step2++;
		printf("\n");
		k--;
	}
}

int main()
{
	int n;
	printf("\nEnter the number of elements:\n");
	scanf("%d",&n);

	int arr[n];
	printf("\nEnter elements:\n");
	for(int i=1;i<=n;i++)
	{
		scanf("%d",&arr[i]);
	}

	printf("\nBefore Heapifying:\n");
	for(int i=1;i<=n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");

	heapify(n,arr);

	printf("\nAfter Heapifying:\n");
	for(int i=1;i<=n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");


	printf("\nInitiating the heapsort process.....\n");

	heapSort(n,arr);

	printf("\nAfter Ascending HeapSort:\n");
	for(int i=1;i<=n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");

	printf("\nAfter Descending HeapSort:\n");
	for(int i=n;i>=1;i--)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");


	printf("\nOpcount: %d\n",opcount);

}