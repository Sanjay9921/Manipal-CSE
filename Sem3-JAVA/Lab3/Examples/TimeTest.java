import java.util.*;
class Time
{
	int sec;
	int min;
	int hr;
	Scanner sc = new Scanner(System.in);
	public void display(Time a)
	{
		System.out.println(a.hr + ":" + a.min + ":" + a.sec);
	}
	public void assign(int hr,int min,int sec)
	{
		this.sec = sec;
		this.hr = this.sec/3600;
		this.sec-=3600*this.hr;
		this.min = this.sec/60;
		this.sec-=60*this.min;
	}
	public Time add(Time a1)
	{
		Time t = new Time();
		t.hr= this.hr + a1.hr;
		t.min = this.min + a1.min;
		t.sec= this.sec + a1.sec;		
		display(t);
		return(t);
	}
	public Time sub(Time a2)
	{
		Time t1 = new Time();
		int diff;
		int comp1,comp2;
		comp1 = this.hr + (this.min/60) + (this.sec/3600);
		comp2 = a2.hr + (a2.min/60) + (a2.sec/3600);
		if(comp1>comp2)
		{
			diff=comp1-comp2;
		}
		else
		{
			diff=comp2-comp1;
		}
		t1.hr=diff;
		t1.min=(diff*60);
		t1.sec=(diff*3600);
		display(t1);
		return(t1);
	}	
}
public class TimeTest
{
	public static void main(String[] args)
	{
		Time ob1 = new Time();
		Time ob2 = new Time();
		int sec_1,sec_2,min_1,min_2,hr_1,hr_2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first hour,minute and seconds:\t");
		sec_1=sc.nextInt();
		min_1=sc.nextInt();
		hr_1=sc.nextInt();
		System.out.println("Enter the second hour,minute and seconds:\t");
		sec_2=sc.nextInt();
		min_2=sc.nextInt();
		hr_2=sc.nextInt();
		ob1.assign(hr_1,min_1,sec_1);
		ob2.assign(hr_2,min_2,sec_2);
		System.out.println("The addition is:\t");
		ob1.add(ob2);
		System.out.println("\nThe subtraction is:\t");
		ob1.sub(ob2);
	}
}