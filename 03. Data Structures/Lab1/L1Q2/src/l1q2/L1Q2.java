// Linear Search
// Time Complexity:= O(N)
// Space Complexity:= O(1)

package l1q2;

import java.util.*;

public class L1Q2 {

    public static int linearSearch(int[] arr, int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements: ");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to be searched: ");
        int key = sc.nextInt();
        
        int resultIndex = linearSearch(arr, key);
        if(resultIndex != -1){
            System.out.println("Element has been found at index: " + resultIndex);
        }
        else{
            System.out.println("Element does not exist!");
        }
        
    }
    
}
