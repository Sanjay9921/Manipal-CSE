import java.lang.*;
import java.util.*;

public class l3a3{
	public static void main(String[] args){
		
		int days;
		System.out.println(">> How many days has it been Mr. Ryan Literally Me Gosling to return the book? ");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();

		double fine = 0.0;

		if(days<6){
			fine = 0.50;
		}
		else if(days<11){
			fine = 1.00;
		}
		else if(days<31){
			fine = 5.00;
		}
		else{
			fine = 10.00;
		}

		System.out.println(">>> Mr Ryan Gosling, you have to pay Rs. " + (days * fine));
		
	}
}