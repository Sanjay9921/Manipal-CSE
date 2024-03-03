#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef enum { NO, YES } BOOL;

BOOL isSubsetSum (int arr[], int n, int sum) {
	if (sum == 0)
		return YES;
	if (n == 0 && sum != 0)
		return NO;
	if (arr[n-1] > sum)
		return isSubsetSum(arr, n-1, sum);
   	return isSubsetSum(arr, n-1, sum)||isSubsetSum(arr, n-1, sum-arr[n-1]);
}

BOOL findPartition(int arr[], int n,int opcount) 
{
	int sum = 0, i;
	for (i = 0; i < n; ++i)
	{
		opcount++;
		sum += arr[i];
	}
	if (sum % 2 != 0)
	{
		printf("\nOpcount: %d\n",opcount);
		return NO;
	}
	printf("\nOpcount: %d\n",opcount);
    return isSubsetSum(arr, n, sum/2);
}

int main ()
{
	int n;
	printf("\nEnter n:\n");
	scanf("%d",&n);
	int arr[n];
	printf("\nEnter array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	int opcount = 0;

	clock_t t;
	t = clock();
	BOOL res = findPartition(arr, n,opcount);
	t = clock()-t;
	double time_taken = (double)t;

	printf("\nRes is: %d\n",res);
	printf("\nTime in microseconds is: %.5f",time_taken);

	return 0;
}