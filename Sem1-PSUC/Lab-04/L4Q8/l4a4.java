import java.lang.*;
import java.util.*;

public class l4a4{

	static int genericRoot(int x){
		if(x>0){
			return (x%10)+genericRoot(x/10);	
		}
		return 0;
	}

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		int genRootN=n;

		while(true){
			genRootN = genericRoot(genRootN);
			if(genRootN<10){
				break;
			}
		}

		System.out.println("Generic root of " + n + " is: " + genRootN);
		
	}
}