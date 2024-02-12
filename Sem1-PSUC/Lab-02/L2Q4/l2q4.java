import java.lang.*;
import java.util.*;

public class l2q4{

	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a & b: ");
		a = sc.nextInt();
		b = sc.nextInt();

		String choice="Y";

		while(true){

			String operation="";
			System.out.println("Enter an operation: ADD / SUB / MUL / DIV: ");
			operation = sc.next();

			switch(operation){
				case "ADD":
					System.out.println(a + " + " + b + " = " + (a+b));
					break;
				case "SUB":
					System.out.println(a + " - " + b + " = " + (a-b));
					break;
				case "MUL":
					System.out.println(a + " * " + b + " = " + (a*b));
					break;
				case "DIV":
					if(b != 0){
						System.out.println(a + " / " + b + " = " + (double)(a/b));	
					}
					else{
						System.out.println("Zero Division error! Please try again (if)...");
					}
					break;
				default:
					System.out.println("Enter valid options...");
					break;
			}

			System.out.println("Press 'Y' to continue, 'Q' to quit...");
			choice = sc.next();
			
			if(!choice.equals("Y")){
				break;
			}
		}

		System.out.println("Ryan Gosling is literally me. I am him.");
	}
}