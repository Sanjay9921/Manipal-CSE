import java.lang.*;
import java.util.*;

public class l3ex1{

	public static void main(String[] args){
		int a,b,c;
		System.out.println("Enter a, b, c: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double D = Math.pow(b,2) - (4*a*c);
		double root1, root2;

		if(D>0){
			root1 = (-b + Math.sqrt(D))/(2 * a);
			root2 = (-b - Math.sqrt(D))/(2 * a);

			System.out.println("Roots are: " + root1 + " and " + root2);
		}
		else if(D==0){
			root1 = (-b)/(2 * a);
			root2 = root1;

			System.out.println("Roots are: " + root1 + " and " + root2);
		}
		else{
			System.out.println("The roots are not real. ");
		}

		System.out.println("Periodic reminder that I am Ryan Literally Me Gosling from Drive 2011. ");
	}
}