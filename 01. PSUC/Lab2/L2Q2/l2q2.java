import java.lang.*;
import java.util.*;

public class l2q2{

	static double sphereVolume(double radius){
		return (double)(4 * Math.PI * Math.pow(radius,3))/3;
	}

	static double sphereSurfaceArea(double radius){
		return (double)(4 * Math.PI * Math.pow(radius,2));
	}

	public static void main(String[] args){
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = sc.nextDouble();

		System.out.format("Volume of Sphere:= %.2f\n", sphereVolume(radius));
		System.out.format("S.A. of Sphere:= %.2f\n", sphereSurfaceArea(radius));
	}
}