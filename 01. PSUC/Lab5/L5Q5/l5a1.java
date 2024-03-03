import java.lang.*;
import java.util.*;

public class l5a1{

	public static void display(int[] A){
		for(int i: A){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		int[] A = new int[n];
		int arrMin = Integer.MAX_VALUE;
		int arrMax = Integer.MIN_VALUE;

		System.out.println("Enter " + n + " elements: ");
		for(int i=0;i<n;i++){
			A[i] = sc.nextInt();
			arrMin = (arrMin > A[i] ? A[i] : arrMin);
			arrMax = (arrMax < A[i] ? A[i] : arrMax);
		}

		System.out.println("Smallest Element: " + arrMin);
		System.out.println("Largest Element: " + arrMax);

	}
}