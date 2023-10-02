import java.util.Scanner;

public class App {
    public static void QuadraticRoots(int a, int b, int c){
        //D:= Discriminant
        double root1, root2, D;
        D = (b*b) - (4 * a * c);

        if(D>0){
            root1 = ((-b) + Math.sqrt(D))/(2*a);
            root2 = ((-b) - Math.sqrt(D))/(2*a);
            System.out.println("The first root is: " + root1);
            System.out.println("The second root is: " + root2);
        }
        else if(D==0){
            root1 = (-b)/(2 * a);
            System.out.println("The first root is: " + root1);
            System.out.println("The second root is: " + root1);
        }
        else{
            System.out.println("The roots are unreal!");
        }
    }

    public static void main(String[] args) throws Exception {
        int a,b,c;
        System.out.println("Enter a, b, c for quadratic equation: ax^2 + bx + c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        QuadraticRoots(a, b, c);
    }
}
