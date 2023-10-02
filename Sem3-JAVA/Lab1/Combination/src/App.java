import java.util.Scanner;

public class App {

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the values of 'n' and 'r' for nCr: ");
        int n, r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();

        int result = fact(n)/(fact(n-r) * fact(r));
        System.out.println("nCr result is: " + result);
    }
}
