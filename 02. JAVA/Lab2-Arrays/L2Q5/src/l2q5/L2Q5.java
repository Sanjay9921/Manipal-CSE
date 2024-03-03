package l2q5;

import java.util.*;

public class L2Q5 {

    public static void display(int[] A){
        for(int x:A){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public static boolean isPrime(int n){
        
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
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
        
        System.out.println("Possible prime numbers in the list....");
        for(int i=0;i<n;i++){
            if(isPrime(A[i])){
                System.out.print(A[i] + " ");
            }
        }
        System.out.println("");
    }
    
}
