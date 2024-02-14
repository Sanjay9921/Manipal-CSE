#include<stdio.h>
#include<stdlib.h>

int subset_count = 0;

void swap(int *a,int *b)
{
	int t = *a;
	*a = *b;
	*b = t;
}

void bubbleSort(int n,int arr[])
{
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap(&arr[j],&arr[j+1]);
			}
		}
	}
}

void subsetProblem(int n,int arr[],int sum,int start_index,int d)
{
	if(d==sum)
	{
		subset_count++;
		if(start_index < n)
			subsetProblem(n,arr,sum-arr[start_index-1],start_index,d);
	}
	else
	{
		for(int i=start_index;i<n;i++)
		{
			subsetProblem(n,arr,sum+arr[i],i+1,d);
		}
	}
}

int main()
{
	int n;
	printf("\nEnter n:\n");
	scanf("%d",&n);

	int arr[n];

	printf("\nEnter the array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}

	bubbleSort(n,arr);

	printf("\nThe algorithm requires the array to be sorted first...\n");
	for(int i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");

	int d;
	printf("\nEnter d:\n");
	scanf("%d",&d);

	subsetProblem(n,arr,0,0,d);

	printf("\nThe subset counts are: %d\n",subset_count);



	return 0;
}