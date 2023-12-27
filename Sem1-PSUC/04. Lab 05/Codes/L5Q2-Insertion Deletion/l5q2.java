import java.lang.*;
import java.util.*;

public class l5q2{

	public static void display(int[] A){
		for(int i: A){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int A[] = new int[]{5, 9, 6, 10, 12, 7, 3, 5, 4, 2};
		int n = A.length;

		display(A);

		//1. Insert an element (Retain the same size)
		int newElement;
		int newIndex=-1;
		System.out.println("Enter a new element and the index (respectively): ");
		newElement = sc.nextInt();
		newIndex = sc.nextInt();

		for(int i=n-1;i>newIndex;i--){
			A[i] = A[i-1];
		}

		A[newIndex] = newElement;

		display(A);

		//2. Delete an element
		int delElement;
		int delIndex=-1;
		System.out.println("Enter an element to be deleted: ");
		delElement = sc.nextInt();

		for(int i=0;i<n;i++){
			if(A[i] == delElement){
				delIndex = i;
				break;
			}
		}

		if(delIndex == -1){
			System.out.println("Element not found!");
		}
		else{
			for(int i=delIndex;i<n-1;i++){
				A[i] = A[i+1];
			}
			A[n-1] = -1;
		}

		display(A);
	}
}