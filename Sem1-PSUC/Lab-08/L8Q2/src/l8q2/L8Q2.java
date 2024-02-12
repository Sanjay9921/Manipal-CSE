package l8q2;

public class L8Q2 {

    public static boolean isPrime(int n){
        boolean flag=true;
        
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        
        return flag;
    }
    public static void main(String[] args) {
        int n=10;
        int count=0;
        int start=2;
        while(count<n){
            if(isPrime(start)){
                System.out.print(start + " ");
                count++;
            }
            
            start++;
        }
    }
    
}
