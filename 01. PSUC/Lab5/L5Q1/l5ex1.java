import java.lang.*;
import java.util.*;

public class l5ex1{

	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		int[] A = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(int i=0;i<n;i++){
			A[i] = sc.nextInt();
		}

		System.out.println("Array is: ");
		for(int a: A){
			System.out.print(a + " ");
		}
		System.out.println();
	}
}