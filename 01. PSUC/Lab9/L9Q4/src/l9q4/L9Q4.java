package l9q4;

public class L9Q4 {
    
    public static long multiplyMbyN(int m, int n){
        if(n==0){
            return 0;
        }
        
        if(n==1){
            return m;
        }
        
        return m+multiplyMbyN(m,n-1);
    }
    
    public static void main(String[] args) {
        int m=10;
        int n=25;
        System.out.println(m + " x " + n + " = " + multiplyMbyN(m,n));
    }
    
}
