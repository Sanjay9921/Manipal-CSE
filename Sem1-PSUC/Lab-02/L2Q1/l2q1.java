import java.lang.*;
import java.util.*;

public class l2q1{
	static double simpleInterest(double P, int N, double R){
		return (double)(P*N*R)/100;
	}

	static double compoundInterest(double P, int N, double R){
		return (double)(P * Math.pow((1 + (double)(R/100)),N)) - P;
	}

	public static void main(String[] args){
		double principle, rateOfInterest;
		int years;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P,N,R%: ");
		principle = sc.nextDouble(); //P
		years = sc.nextInt(); //N
		rateOfInterest = sc.nextDouble(); //R

		double simpleInterestAmount = simpleInterest(principle,years,rateOfInterest);
		double compoundInterestAmount = compoundInterest(principle,years,rateOfInterest);

		System.out.println("Simple Interest:= " + simpleInterestAmount);
		System.out.format("Compound Interest:= %.2f",compoundInterestAmount);
	}
}