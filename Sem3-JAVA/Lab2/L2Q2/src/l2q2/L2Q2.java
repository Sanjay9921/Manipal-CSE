package l2q2;

import java.util.*;

public class L2Q2 {

    public static void display(int[] A){
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public static void insert(int[] A, int key, int index){
        int n = A.length;
        for(int i=n-1;i>index-1;i--){
            A[i] = A[i-1];
        }
        A[index-1] = key;
    }
    
    public static void delete(int[] A, int key){
        int n = A.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(A[i] == key){
                index = i;
                break;
            }
        }
        
        if(index!=-1){
            for(int i=index;i<n-1;i++){
                A[i] = A[i+1];
            }
            A[n-1] = 0;
        }
        else{
            System.out.println("There is no " + key + " present. Bruh.");
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
        
        insert(A,10,2);
        
        display(A);
        
        delete(A,10);
        
        display(A);
    }
    
}
