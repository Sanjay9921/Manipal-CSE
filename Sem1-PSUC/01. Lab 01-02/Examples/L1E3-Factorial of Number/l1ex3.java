import java.lang.*;
import java.util.*;

public class l1ex3{

	public static long factorial(int n){
		long result = 1;
		for(int i=n;i>0;i-=1){
			result*=i;
		}

		return result;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();

		long result = factorial(n);
		System.out.println("The factorial of  " + n + " is: " + result);

	}
}