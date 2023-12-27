import java.lang.*;
import java.util.*;

public class l5q1{

	static void display(int[] A){
		System.out.println("Array is: ");
		for(int a: A){
			System.out.print(a + " ");
		}
		System.out.println();
	}

	static void ascBubbleSort(int[] A){
		int n = A.length;

		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(A[j] > A[j+1]){
					int t = A[j];
					A[j] = A[j+1];
					A[j+1] = t;
				}
			}
		}
	}

	static void descBubbleSort(int[] A){
		int n = A.length;

		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(A[j] < A[j+1]){
					int t = A[j];
					A[j] = A[j+1];
					A[j+1] = t;
				}
			}
		}
	}

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

		ascBubbleSort(A);
		//descBubbleSort(A);

		display(A);
		
	}
}