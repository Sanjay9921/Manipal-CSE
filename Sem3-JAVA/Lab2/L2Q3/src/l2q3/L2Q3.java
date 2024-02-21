package l2q3;

import java.util.*;

public class L2Q3 {

    public static void display(int[] A){
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public static void linearSearch(int A[], int key){
        int n = A.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(A[i] == key){
                index = i;
                break;
            }
        }
        
        if(index!=-1){
            System.out.println(key + " is found at index: " + index);
        }
        else{
            System.out.println("Element does not exist. Gern Geschehen. ");
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
        
        linearSearch(A, 10);
        
    }
    
}
