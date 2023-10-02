import java.util.Scanner;

public class App {

    public static boolean IsArmStrong(int n){
        int sumOfProducts = 0;
        int tempN = n;
        while(tempN>0){
            int currentDigit = tempN%10;
            sumOfProducts += Math.pow(currentDigit, 3);
            tempN/=10;
        }

        return n == sumOfProducts;
    }

    public static void main(String[] args) throws Exception {
        int n;
        System.out.println("Enter n to validate if its an armstrong number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean result = IsArmStrong(n);
        if(result == true){
            System.out.println(n + " is an armstrong number.");
        }
        else{
            System.out.println(n + " is not an armstrong number.");
        }
    }
}
