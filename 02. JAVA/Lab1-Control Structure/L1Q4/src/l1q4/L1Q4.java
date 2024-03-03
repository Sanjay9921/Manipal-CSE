package l1q4;

import java.util.*;

public class L1Q4 {

    public static boolean isPrime(int n){
        
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
        
        int start=2;
        int count=0;
        while(count<n){
            if(isPrime(start)){
                System.out.print(start + " ");
                count++;
            }
            start++;
        }
    }
    
}
