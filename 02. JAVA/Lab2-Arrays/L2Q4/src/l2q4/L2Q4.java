package l2q4;

import java.util.*;

public class L2Q4 {

    public static void display(int[][] A){
        for(int i[]:A){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        
        System.out.println("Matrix A: ");
        System.out.println("Enter " + n + "x" + n + " elements...");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix B: ");
        System.out.println("Enter " + n + "x" + n + " elements...");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                B[i][j] = sc.nextInt();
            }
        }
        
        int C[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        display(C);
    }
    
}
