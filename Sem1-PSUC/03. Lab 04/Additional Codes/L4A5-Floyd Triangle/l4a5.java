import java.lang.*;
import java.util.*;

public class l4a5{

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		int counter=1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.format("%02d ",counter++);
			}
			System.out.println();
		}
		
	}
}