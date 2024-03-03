package l8q1;

public class L8Q1 {
    
    public static long fact(int n){
        
        if(n==0){
            return 1;
        }
        
        long result=1;
        for(int i=2;i<=n;i++){
            result *= i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int n=5;
        int r=2;
        long nCr = fact(n)/(fact(r) * fact(n-r));
        System.out.println(nCr);
    }
    
}
