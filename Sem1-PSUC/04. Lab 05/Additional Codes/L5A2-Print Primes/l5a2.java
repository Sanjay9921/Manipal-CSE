import java.lang.*;
import java.util.*;

public class l5a2{

	public static void display(int[] A){
		for(int i: A){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	static boolean isPrime(int x){
		if(x<=1){
			return false;
		}

		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		int[] A = new int[n];

		int[] primes = new int[n];
		int k=0;

		System.out.println("Enter " + n + " elements: ");
		for(int i=0;i<n;i++){
			A[i] = sc.nextInt();
			if(isPrime(A[i])){
				primes[k++] = A[i];
			}
		}

		if(primes.length>0){
			display(primes);
		}
		else{
			System.out.println("There are no prime numbers in the array you entered.");
		}



	}
}