import java.lang.*;
import java.util.*;

public class l3a1{
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();

		String result = "";

		if(a>0){
			result = "positive";
		}
		else if(a==0){
			result = "zero";
		}
		else{
			result = "negative";
		}

		System.out.println(a + " is " + result);
		
	}
}