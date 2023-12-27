import java.lang.*;
import java.util.*;

public class l2q3{

	static double fahrenheitToCentigrade(double F){
		return ((double)5/9) * (double)(F - 32);
	}

	public static void main(String[] args){
		double F;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fahrenheit: ");
		F = sc.nextDouble();

		System.out.format("Centigrade equivalent is:= %.2f\n", fahrenheitToCentigrade(F));
	}
}