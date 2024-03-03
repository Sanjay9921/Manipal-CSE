package l6q3;

import java.util.*;
import java.text.*;

class Person{
    private String name;
    private GregorianCalendar dob;
    
    Person(){}
    
    Person(String name, GregorianCalendar dob){
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDob() {
        return dob;
    }

    public void setDob(GregorianCalendar dob) {
        this.dob = dob;
    }
    
    public void input(){
        System.out.println("Person Class...");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        
        System.out.println("Enter date of birth: (YYYY MM DD)");
        this.dob = new GregorianCalendar(sc.nextInt(), sc.nextInt()-1, sc.nextInt());
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        return "Person{" + "name=" + name + ", dob=" + sdf.format(dob.getTime()) + '}';
    }
}

class CollegeGrad extends Person{
    private float GPA;
    private String yearGrad;
    
    CollegeGrad(){}
    
    CollegeGrad(String name, GregorianCalendar dob, float GPA, String yearGrad) {
        super(name, dob);
        this.GPA = GPA;
        this.yearGrad = yearGrad;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getYearGrad() {
        return yearGrad;
    }

    public void setYearGrad(String yearGrad) {
        this.yearGrad = yearGrad;
    }
    
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("College Grad Class...");
        
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        
        System.out.println("Enter date of birth: (YYYY MM DD)");
        setDob(new GregorianCalendar(sc.nextInt(), sc.nextInt()-1, sc.nextInt()));
        
        System.out.println("Enter GPA: ");
        this.GPA = sc.nextFloat();
        
        System.out.println("Enter year of graduation: ");
        this.yearGrad = sc.nextLine();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        return "Person{" + "name=" + getName() + ", dob=" + sdf.format(getDob().getTime()) + ", gpa: " + this.getGPA() + ", year of graduation: " + this.getYearGrad() + '}';
    }
}

public class L6Q3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();
        System.out.println(p1); // also same as sout > p1.toString()
        
        CollegeGrad cg1 = new CollegeGrad();
        cg1.input();
        System.out.println(cg1); // also same as sout > cg1.toString()
    }
    
}
