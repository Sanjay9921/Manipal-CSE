import java.lang.*;
import java.util.*;

public class l4a3{

	static int fact(int x){
		if(x==1 || x==0){
			return x;
		}

		return x*fact(x-1);
	}

	static boolean isStrong(int x){
		int sum=0;
		int tempX = x;

		while(x>0){
			int rem = x%10;
			sum += fact(rem);
			x/=10;
		}
		return sum==tempX;
	}

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		if(isStrong(n)){
			System.out.println(n + " is a strong number.");
		}
		else{
			System.out.println(n + " is NOT a strong number.");
		}
		
	}
}