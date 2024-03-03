import java.lang.*;
import java.util.*;

public class l3a2{
	public static void main(String[] args){
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int result = (a < b ? (a < c ? a: c) : (b < c ? b: c));
		System.out.println("The smallest amongst the three is: " + result);
		
	}
}