import java.lang.*;
import java.util.*;

public class l5a3{

	public static void display(int[][] A){
		for(int i[]: A){
			for(int j:i){
				System.out.print(j+" ");	
			}
		System.out.println();	
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int[][] A = {
			{5, 9, 6},
			{10, 12, 7},
			{3, 5, 4, }
		};

		int n = A.length;

		display(A);

		int count=0, value;
		System.out.println("Enter the value to be searched: ");
		value = sc.nextInt();

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(A[i][j] == value)
				count++;
			}
		}

		
		System.out.println("The value: " + value + " occurs " + count + " times in the matrix.");
	}
}