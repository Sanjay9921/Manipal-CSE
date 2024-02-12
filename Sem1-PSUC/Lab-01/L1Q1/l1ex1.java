import java.lang.*;
import java.util.*;

public class l1ex1{

	public static double areaOfCircle(double radius){
		return 3.1416 * radius * radius;
	}

	public static void main(String[] args){
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = sc.nextDouble();

		double result = areaOfCircle(radius);
		System.out.println("Area of the circle with radius " 
			+ radius + " is: " + result);

	}
}