package l9q3;

public class L9Q3 {

    public static int fibonacciNTerm(int n){
        if(n<=1){
            return 0;
        }
        
        if(n==2 || n==3){
            return 1;
        }
        
        return fibonacciNTerm(n-1) + fibonacciNTerm(n-2);
    }
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
            System.out.print(fibonacciNTerm(i) + " ");
        }
        System.out.println();
    }
    
}
