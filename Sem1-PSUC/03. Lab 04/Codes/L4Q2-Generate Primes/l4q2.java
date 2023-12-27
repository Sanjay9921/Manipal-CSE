import java.lang.*;
import java.util.*;

public class l4q2{

	static boolean isPrime(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args){
		
		int lower, upper;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower and upper limit: ");
		lower = sc.nextInt();
		upper = sc.nextInt();

		for(int i=lower;i<=upper;i++){
			if(isPrime(i) && i>1){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}
}