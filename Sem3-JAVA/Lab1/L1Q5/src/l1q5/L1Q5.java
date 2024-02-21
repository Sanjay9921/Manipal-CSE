package l1q5;

import java.util.*;

public class L1Q5 {

    public static boolean isArmstrong(int n){
        int sum=0;
        int temp = n;
        
        while(temp>0){
            int r = temp%10;
            sum += Math.pow(r,3);
            temp/=10;
        }
        
        return sum==n;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        boolean result = isArmstrong(n);
        if(result){
            System.out.println(n + " is an Armstrong number. ");
        }
        else{
            System.out.println(n + " is NOT an Armstrong number. ");
        }
    }
    
}
