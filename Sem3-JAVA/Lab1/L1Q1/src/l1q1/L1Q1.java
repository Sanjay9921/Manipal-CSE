package l1q1;

import java.util.*;

public class L1Q1 {
    
    public static int largest(int a, int b, int c){
        return (a>b ? (c>a? c : a) : (c>b ? c: b));
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int result = largest(a,b,c);
        System.out.println("The largest of " + a + ", " + b + ", and " + c + " = " + result);
        
    }
    
}
