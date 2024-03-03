// Selection Sort
// Time Complexity:= O(N^2)
// Space Complexity:= O(1)

package l1q1;

public class L1Q1 {
    
    public static void swap(int[] arr, int p1, int p2){
        int t = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = t;
    }
    
    public static void display(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static void selectionSort(int[] arr){
        
        int n = arr.length;
        int min_i;
        
        for(int i=0;i<n-1;i++){
            min_i = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_i]){
                    min_i = j;
                }
            }
            
            if(min_i != i){
                swap(arr,i,min_i);
            }
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr = {1,10,4,9,6,2,7,3,8,5};
        display(arr);
        selectionSort(arr);
        display(arr);
    }
    
}
