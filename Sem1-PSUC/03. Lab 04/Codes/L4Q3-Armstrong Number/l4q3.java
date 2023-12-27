import java.lang.*;
import java.util.*;

public class l4q3{

	static boolean isArmstrong(int n){
		int sum=0;
		int tempN = n;
		while(n>0){
			int rem = n%10;
			sum += Math.pow(rem,3);
			n/=10;
		}

		return sum==tempN;
	}

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		if(isArmstrong(n)){
			System.out.println(n + " is an armstrong number.");
		}
		else{
			System.out.println(n + " is not an armstrong number.");
		}
		
		
	}
}