import java.lang.*;
import java.util.*;

public class l2a1{
	static String convertTime(int s){
		int h=(s/3600);
		s-=3600;
		int m=(s/60);
		s-=60;

		String hours,minutes,seconds;
		hours = (h<10 ? (String)("0" + h) : (String)(""+h));
		minutes = (m<10 ? (String)("0" + m) : (String)(""+m));
		seconds = (s<10 ? (String)("0" + s) : (String)(""+s));

		return (String)(hours + "h : " + minutes + "m : " + seconds +"s");
	}

	public static void main(String[] args){
		int seconds;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total seconds: ");
		seconds	= sc.nextInt();

		System.out.println(convertTime(seconds));
	}
}