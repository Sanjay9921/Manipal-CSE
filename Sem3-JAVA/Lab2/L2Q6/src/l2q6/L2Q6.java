package l2q6;

import java.util.*;

public class L2Q6 {

    public static int trace(int[][] A){
        int n  = A.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += A[i][i];
        }
        
        return sum;
    }
    
    public static double norm(int[][] A){
        int n  = A.length;
        double sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum += Math.pow(A[i][j],2);
            }
        }
        
        return Math.sqrt(sum);
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int A[][] = new int[n][n];
        
        System.out.println("Matrix A: ");
        System.out.println("Enter " + n + "x" + n + " elements...");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        int resTrace = trace(A);
        double resNorm = norm(A);
        
        System.out.println("Trace of A:= " + resTrace + " and Norm of A:= " + resNorm);
    }
    
}
