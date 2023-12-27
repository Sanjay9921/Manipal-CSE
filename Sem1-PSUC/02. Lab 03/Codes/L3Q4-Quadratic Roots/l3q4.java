import java.lang.*;
import java.util.*;

public class l3q4{

	public static void main(String[] args){
		int a,b,c;
		System.out.println("Enter a, b, c: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double D = Math.pow(b,2) - (4*a*c);
		double root1, root2;


		//Difference between the Example and this program
		//Use SWITCH CASE

		int flag = (D>0 ? 1 : (D==0 ? 0 : -1));

		switch(flag){
			case 1:
				root1 = (-b + Math.sqrt(D))/(2 * a);
				root2 = (-b - Math.sqrt(D))/(2 * a);

				System.out.println("Roots are: " + root1 + " and " + root2);
				break;

			case 0:
				root1 = (-b)/(2 * a);
				root2 = root1;

				System.out.println("Roots are: " + root1 + " and " + root2);
				break;

			case -1:
				System.out.println("The roots are not real. ");
				break;
		}

		System.out.println("Periodic reminder that I am Ryan Literally Me Gosling from Drive 2011. ");
	}
}