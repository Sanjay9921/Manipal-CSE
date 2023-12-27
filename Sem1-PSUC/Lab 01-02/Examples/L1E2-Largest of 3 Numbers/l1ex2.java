import java.lang.*;
import java.util.*;

public class l1ex2{

	public static int largestOf3Numbers(int a, int b, int c){
		return (a>b ? (a>c?a:c) : (b>c?b:c));
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();

		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();

		System.out.println("Enter 3rd number: ");
		c = sc.nextInt();

		int result = largestOf3Numbers(a, b, c);
		System.out.println("The largest of 3 numbers given is " + result);

	}
}