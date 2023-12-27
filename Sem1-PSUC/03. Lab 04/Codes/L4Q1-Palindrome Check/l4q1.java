import java.lang.*;
import java.util.*;

public class l4q1{

	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		String actualN = Integer.toString(n).trim();

		int revN=0;
		String reverseN="";

		while(n>0){
			int rem = n%10;
			revN = (revN*10) + rem;
			reverseN += rem;
			n/=10;
		}

		if(actualN.equals(reverseN)){
			System.out.println("Is a palindrome!");
		}
		else{
			System.out.println("Is NOT a palindrome!");
		}
		
	}
}