import java.lang.*;
import java.util.*;

public class l4ex1{

	static void doWhileLoop(int x){

		int counter=1;
		do{
			x += counter++;
		}while(counter<1);

		System.out.println("Do While Loop: " + x);
	}

	static void whileLoop(int x){

		int counter=1;
		while(counter<1){
			x += counter++;
		};

		System.out.println("While Loop: " + x);
	}

	public static void main(String[] args){
		whileLoop(0);
		doWhileLoop(0);
	}
}