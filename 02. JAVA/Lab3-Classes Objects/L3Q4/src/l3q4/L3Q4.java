package l3q4;

import java.util.*;

class Mixer{
    int n;
    int arr[];
    
    Scanner sc = new Scanner(System.in);
    
    public void accept(){
        System.out.println("Enter n: ");
        n = sc.nextInt();
        
        arr = new int[n];
        
        System.out.println("Enter array of " + n + " sorted elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        bubbleSort();
    }
    
    public void bubbleSort(){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n-i-1;j++){
                if(this.arr[j+1] < this.arr[j]){
                    int t = this.arr[j];
                    this.arr[j] = arr[j+1];
                    this.arr[j+1] = t;
                }
            }
        }
    }
    
    public Mixer mix(Mixer A){
        int m = A.arr.length;
        Mixer result = new Mixer();
        result.n = this.n + m;
        result.arr = new int[result.n];
        
        int i=0,j=0;
        int k=0;
        
        while(i<this.n && j<m){
            if(this.arr[i] > A.arr[j]){
                result.arr[k++] = A.arr[j++];
            }
            else{
                result.arr[k++] = this.arr[i++];
            }
        }
        
        while(i<this.n){
            result.arr[k++] = this.arr[i++];
        }
        
        while(j<m){
            result.arr[k++] = A.arr[j++];
        }
        
        return result;
    }
    
    public void display(){
        for(int x:this.arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}

public class L3Q4 {
    public static void main(String[] args) {
        
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        
        System.out.println("Array1...");
        m1.accept();
        
        System.out.println("Array2...");
        m2.accept();
        
        m1.display();
        
        m2.display();
        
        Mixer m3 = m1.mix(m2);
        m3.display();
    }
    
}
