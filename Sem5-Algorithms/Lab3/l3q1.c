//Bubble Sort
//Time efficiency
//Best and Worst Case

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int bubbleSort(int arr[],int n,int opcount)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			++opcount;
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}

	return opcount;
}

int main()
{
	int n;
	printf("\nEnter n:\n");
	scanf("%d",&n);
	int arr[n];
	printf("\nEnter numbers into an array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}

	int seconds_to_micro = 1000000;

	clock_t t;
	t = clock();
	int opcount = bubbleSort(arr,n,0);
	t = clock() - t;
	double time_taken = ((double)t)/CLOCKS_PER_SEC*seconds_to_micro;

	printf("\nInput Size = %d",n);
	printf("\nSorted array is:\n");
	for(int i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\nOpcount = %d",opcount);
	printf("\nTime Taken in microseconds= %.5f\n",time_taken);

	return 0;

}