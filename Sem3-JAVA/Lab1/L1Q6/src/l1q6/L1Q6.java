package l1q6;

import java.util.*;

public class L1Q6 {

    public static int findSum(int n){
        int sum=0;
        while(n>0){
            sum += (n%10);
            n/=10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
            
        int result = findSum(n);
        System.out.println("Sum of the digits of " + n + " = " + result);
    }
    
}
