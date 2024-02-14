//Complex Class
import java.util.*;
class Complex
{
	double real;
	double imag;
	
	Complex()
	{
		this.real = 0.0;
		this.imag = 0.0;
	}
	Complex(double real,double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	public Complex add(Complex n)
	{
		Complex num1 = new Complex();
		num1.real = this.real + n.real;
		num1.imag = this.imag + n.imag; 
	}
	public Complex diff(Complex n)
	{
		Complex num2 = new Complex();
		Complex a = new Complex();
		Complex b = new Complex();
		a.real = this.real;
		a.imag = this.imag;
		b.real = n.real;
		b.imag = n.imag;
		if(a.real>b.real)
		{
			num2.real = a.real - b.real;
		}
		else
		{
			num2.real = b.real - a.real;
		}
		if(a.imag>b.imag)
		{
			num2.imag = a.imag - b.imag;
		}
		else
		{
			num2.imag = b.imag - a.imag;
		}
	}	
	public void display()
	{
		System.out.println("\nThe sum is: "+this.real+" +i "+this.imag);
	}
}
public class l3_q1
{
	public static void main(String args[])
	{
		double real_1;
	    double real_2;
	    double imag_1;
	    double imag_2;
	    Scanner sc = Scanner(System.in);
	    System.out.println("\nFirst object real and imag:\n");
		real_1 = sc.nextDouble();
		imag_1 = sc.nextDouble();
		System.out.println("\nSecond object real and imag:\n");
		real_2 = sc.nextDouble();
		imag_2 = sc.nextDouble();
		Complex n1 = new Complex();
		Complex n2 = new Complex();
		n1.Complex(real_1,imag_1);
		n2.Complex(real_2,imag_2);
		double sum = n1.add(n2);
		double sub = n1.sub(n2);
		System.out.println("\nAdd: \t"+sum+"\n");
		System.out.println("\nDiff: \t"+sub+"\n"); 

	}
}