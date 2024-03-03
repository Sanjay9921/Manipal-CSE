import java.util.*;
class Complex
{
	private double real;
	private double imag;
	private String id;
	private Scanner sc = new Scanner(System.in);

	//Constructors
	public Complex()
	{
		this.real = 0.0;
		this.imag = 0.0;
	}
	public Complex(String id)
	{
		this.real = 0.0;
		this.imag = 0.0;
		this.id = id;
	}
	public Complex(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
		this.id = "";
	}

	//Setters
	public void setReal(double real)
	{
		this.real = real;
	}
	public void setImag(double imag)
	{
		this.imag = imag;
	}
	public void setID(String id)
	{
		this.id = id;
	}

	public void input()
	{
		System.out.print("\n\tEnter Real (" + this.id + ") : ");
		this.real = sc.nextDouble();
		System.out.print("\n\tEnter Imaginary (" + this.id + ") : ");
		this.imag = sc.nextDouble();
	}

	//Display
	@Override
	public String toString()
	{
		return ("\t" + this.id + " = " + this.real + ((this.imag<0)?" ":" + ") + this.imag + "i.\n");
	}

	//add and subtract 
	public static Complex add (Complex a,Complex b)
	{
		Complex s = new Complex(a.real + b.real, a.imag + b.imag);
		return s;
	}

	public static Complex subtract (Complex a,Complex b)
	{
		Complex d = new Complex(a.real - b.real, a.imag - b.imag);
		return d;
	}

	public static Complex conjugate(Complex a)
	{
		Complex c = new Complex(a.real, - a.imag);
		return c;
	}

	public static Complex multiply (Complex a,Complex b)
	{
		Complex p =new Complex(a.real*b.real - a.imag * b.imag, a.imag * b.real + a.real * b.imag);
		return p;
	}

	public static Complex divide (Complex a,Complex b)
	{
		Complex r = Complex.multiply(a, Complex.conjugate(b));
		double bxbc = (b.real * b.real + b.imag * b.imag);
		r.setReal(r.real/bxbc);
		r.setImag(r.imag/bxbc);
		return r;
	}
}

public class ComplexTest
{
	public static void main(String[] args)
	{
		Complex a = new Complex("A");
		Complex b = new Complex("B");
		a.input();
		b.input();

		Complex s = Complex.add(a,b);
		s.setID("A + B");

		Complex d = Complex.subtract(a,b);
		d.setID("A-B");

		Complex p = Complex.multiply(a,b);
		d.setID("A x B");

		Complex r = Complex.divide(a,b);
		r.setID("A / B");

		System.out.println(" " + a + b + s + d + p + r);
	}
}