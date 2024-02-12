package l9q1;

public class L9Q1 {
    
    public static long factorialOfNum(long n){
        if(n==1){
            return 1;
        }
        
        return n*factorialOfNum(n-1);
    }
    
    public static void main(String[] args) {
        long n = 5;
        System.out.println("Factorial of " + n + " = " + factorialOfNum(n));
    }
    
}
