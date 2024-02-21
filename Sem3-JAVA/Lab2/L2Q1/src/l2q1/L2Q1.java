package l2q1;

import java.util.*;

public class L2Q1 {
    
    public static void display(int[] A){
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] A, boolean asc){
        int n = A.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(asc){
                    if(A[j+1] < A[j]){
                        int t = A[j];
                        A[j] = A[j+1];
                        A[j+1] = t;
                    }
                }
                else{
                    if(A[j] < A[j+1]){
                        int t = A[j];
                        A[j] = A[j+1];
                        A[j+1] = t;
                    }
                }
                
            }
        }
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int A[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        
        display(A);
        
        bubbleSort(A, false);
        
        display(A);
        
    }
    
}
