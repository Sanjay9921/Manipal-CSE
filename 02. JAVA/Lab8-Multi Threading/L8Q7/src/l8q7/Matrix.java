package l8q7;

import java.util.Scanner;

public class Matrix{
    int n;
    int[][] matrix;
    
    Matrix(){}
    
    Matrix(int n){
        this.n = n;
        this.matrix = new int[n][n];
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for " + this.n + "x" + this.n + " matrix: ");
        for(int i=0;i<n;i++){
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
}
