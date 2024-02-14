#include<stdio.h>
#include<stdlib.h>
  
void swap(int* a, int* b) 
{ 
    int t = *a; 
    *a = *b; 
    *b = t; 
} 

int opcount=0;
  

int partition (int arr[], int l, int r) 
{ 
    int pivot = arr[r];  
    int i = (l - 1); 
  
    for (int j = l; j <= r- 1; j++) 
    { 
        
        if (arr[j] < pivot) 
        { 
            //opcount++;
            i++;    
            swap(&arr[i], &arr[j]); 
        } 
    } 
    swap(&arr[i + 1], &arr[r]); 
    return (i + 1); 
} 

void quickSort(int arr[], int l, int r) 
{ 
    opcount++;
    if (l < r) 
    { 
        
        int p = partition(arr, l, r); 
        quickSort(arr, l, p - 1); 
        quickSort(arr, p + 1, r); 
    } 
} 

void printArray(int arr[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        printf("%d ", arr[i]); 
    printf("\n"); 
} 
  

int main() 
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
    quickSort(arr, 0, n-1); 

    printf("\nSorted array: \n"); 
    printArray(arr, n);

    printf("\nOpcount is: %d\n",opcount);
    return 0; 
} 