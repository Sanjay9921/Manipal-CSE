import java.util.*;
import java.text.*;
class Student
{
	Scanner sc = new Scanner(System.in);
	int regNo;
	String full_name;
	GregorianCalendar doj;
	short sem;
	float gpa;
	float cgpa;
	int size;
	int a[100];
	Student()
	{
		regNo = 0;
		full_name = "";
		doj = new GregorianCalendar(0,0,0);
		sem = 0;
		gpa = 0.0;
		cgpa = 0.0;
		size = 0;
		a[] = new Student[size];
	}
	Student(Student s)
	{
		this.regNo = s.regNo;
		this.full_name = s.full_name;
		this.doj = s.doj;
		this.sem = s.sem;
		this.gpa = s.gpa;
		this.cgpa = s.cgpa;
		this.size = s.size;
		this.a[] = new Student[size];
	}
	public void display()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
		System.out.println("\nName\n"+this.name+"\nRegistration Number:\n"+this.reg+"\nDate joined\n"+sdf.format(doj.getTime())+"\nSemester:\n"+this.sem+"\nGPA:\n"+this.gpa+"\nCGPA:\n"+this.cgpa);
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter name:\n");
		this.name = sc.nextLine();
		System.out.println("\nEnter date joined:\n");
		this.doj = new GregorianCalendar(sc.nextInt(),sc.nextInt()-1,sc.nextInt());
		System.out.println("\nEnter semester:\n");
		semester = sc.nextShort();
		System.out.println("\nEnter gpa:\n");
		gpa = sc.nextFloat();
		System.out.println("\nEnter cgpa:\n");
		cgpa = sc.nextFloat();
		System.out.println();
	}
}
