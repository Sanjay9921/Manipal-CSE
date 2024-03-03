// Binary Search
// Time Complexity:= O(LogN)
// Space Complexity:= O(1)

package l1q3;

import java.util.*;

public class L1Q3 {

    // array must be sorted
    public static int binarySearch(int[] arr, int key, int l, int r){
        int m;
        
        while(l<r){
            m = (l+r)/2;
            if(key==arr[m]){
                return m;
            }
            else if(key>arr[m]){
                return binarySearch(arr,key,m+1,r);
            }
            else{
                return binarySearch(arr,key,l,m-1);
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements in SORTED ASCENDING ORDER: ");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to be searched: ");
        int key = sc.nextInt();
        
        int resultIndex = binarySearch(arr, key, 0, n-1);
        if(resultIndex != -1){
            System.out.println("Element has been found at index: " + resultIndex);
        }
        else{
            System.out.println("Element does not exist!");
        }
    }
    
}
