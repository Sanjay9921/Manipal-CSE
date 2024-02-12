package l9q2;

public class L9Q2 {
    
    public static int gcdOfTwoNumbers(int m, int n){
        if(n==1 || n==0){
            return m;
        }
        
        if(m<n){
            return gcdOfTwoNumbers(n,m);
        }
        
        return gcdOfTwoNumbers(m-n,n);
    }
    
    public static void main(String[] args) {
        int m=384;
        int n=15;
        System.out.println("GCD of " + m + " and " + n + " = " + gcdOfTwoNumbers(m,n));
    }
    
}
