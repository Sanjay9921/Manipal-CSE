package l1q3;

import java.util.*;

public class L1Q3 {

    public static long fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n,r;
        System.out.println("Equation: nCr, Enter n and r: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        
        long result = fact(n)/(fact(r) * fact(n-r));
        System.out.println(n + "C" + r + " = " + result);
    }
    
}
