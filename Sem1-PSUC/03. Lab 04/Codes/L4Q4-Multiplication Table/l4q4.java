import java.lang.*;
import java.util.*;

public class l4q4{

	public static void main(String[] args){
		
		int n, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and k: ");
		n = sc.nextInt();
		k = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.println("-----------Multiplication Table of " + i + "-----------");
			for(int j=1;j<=k;j++){
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("-------------------------------------------------------");
		}
		
	}
}