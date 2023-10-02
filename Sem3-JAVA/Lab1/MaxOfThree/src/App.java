import java.util.Scanner;

public class App {

    public static int MaxOfThree(int a, int b, int c){
        return (a>b?(a>c?a:c):(b>c?b:c));
    }
    public static void main(String[] args) throws Exception {
        int a,b,c;
        System.out.println("Enter a, b and c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result = MaxOfThree(a, b, c);
        System.out.println("The largest of " + a + " " + b + " " + c + " is: " + result);
    }
}
