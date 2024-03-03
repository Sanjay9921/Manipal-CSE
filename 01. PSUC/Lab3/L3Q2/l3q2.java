import java.lang.*;
import java.util.*;

public class l3q2{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int result=a;

		if(a>b){
			if(a>c){
				result = a;
			}
			else{
				result = c;
			}
		}
		else{
			if(b>c){
				result = b;
			}
			else{
				result = c;
			}
		}

		System.out.println(result + " is the largest of three!");
		
	}
}