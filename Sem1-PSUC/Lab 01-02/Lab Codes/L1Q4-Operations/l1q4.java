import java.lang.*;
import java.util.*;

public class l1q4{

	public static void main(String[] args){
		double x=2,y=3,z=4;
		double a=2,b=3;

		//Formula 1
		double result = (4.2 * (x + y) * 5/z - 0.52 * x / (y + z)) / Math.pow((x+y),2);
		System.out.format("%.4f",result);

		System.out.println();

		//Formula 2
		result = Math.pow(a,2) + (2*a*b) + Math.pow(b,2);
		System.out.format("%.4f",result);
	}
}