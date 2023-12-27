import java.lang.*;
import java.util.*;

public class l2a2{
	static double piggyBank(int twenties, int tens, int fives, int paisas){
		double totalAmount=(20*twenties + 10*tens + 5*fives + 0.5*paisas);
		return totalAmount;
	}

	public static void main(String[] args){
		int twenties, tens, fives, paisas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of Rs. 20s, 10s, 5s and 0.50s respectively: ");
		twenties = sc.nextInt();
		tens = sc.nextInt();
		fives = sc.nextInt();
		paisas = sc.nextInt();

		System.out.println("Total Amount: Rs. " + piggyBank(twenties, tens, fives, paisas));
	}
}