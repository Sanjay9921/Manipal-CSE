import java.lang.*;
import java.util.*;

public class l4a1{

	static boolean isPerfect(int x){
		int sum=0;
		for(int i=1;i<=x/2;i++){
			if(x%i==0){
				sum += i;
			}
		}

		return sum==x;
	}

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		if(isPerfect(n)){
			System.out.println(n + " is a perfect number.");
		}
		else{
			System.out.println(n + " is NOT a perfect number.");
		}
		
	}
}