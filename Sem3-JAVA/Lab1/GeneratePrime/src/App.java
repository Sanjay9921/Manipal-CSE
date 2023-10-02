import java.util.Scanner;

public class App {
    
    public static boolean IsPrime(int n){
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) throws Exception {
        int n;
        System.out.println("Enter n (to generate the first 'n' prime numbers): ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int count=0;
        int start=2;
        while(count<10){
            if(IsPrime(start)){
                System.out.println(start);
                count++;
            }

            start++;
        }
    }
}
