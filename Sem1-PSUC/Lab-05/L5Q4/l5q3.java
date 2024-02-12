import java.lang.*;
import java.util.*;

public class l5q3{

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

		int key=-1, value;
		System.out.println("Enter the value to be searched: ");
		value = sc.nextInt();

		for(int i=0;i<n;i++){
			if(A[i] == value){
				key = i;
				break;
			}
		}

		if(key!=-1){
			System.out.println("The value: " + value + " can be found at index: " + key);
		}
		else{
			System.out.println("Non existant!");
		}
	}
}