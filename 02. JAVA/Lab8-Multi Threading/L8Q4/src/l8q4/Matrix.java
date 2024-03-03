package l8q4;

import java.util.Scanner;

public class Matrix {
    int m,n;
    int[][] matrix;
    
    Matrix(){}
    
    Matrix(int m, int n){
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for " + this.m + "x" + this.n + " matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    public void display(){
        System.out.println("Matrix Display: ");
        for(int i[]:matrix){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    public int[] getRow(int i){
        return matrix[i];
    }
}
