package l7q6;

import java.util.*;
import java.text.*;

public class Student {
    private int regNo;
    private String name;
    private GregorianCalendar doj; // date of joining
    private int yearOfJoining; // yyyy
    static int counter=1;
    
    // Constructors
    public Student(){}

    public Student(int regNo, String name, GregorianCalendar doj){
        this.regNo = regNo;
        this.name = name;
        this.doj = doj;
    }
   
    // Other Methods
    public void input() throws SeatsFilledException{
        if(this.counter > 25){
            throw new SeatsFilledException();
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        
        System.out.println("Enter date of joining (YYYY MM DD): ");
        this.doj = new GregorianCalendar(sc.nextInt(), sc.nextInt()-1, sc.nextInt());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        this.yearOfJoining = Integer.parseInt(sdf.format(this.doj.getTime()));
        
        this.regNo = (this.yearOfJoining%100)*100 + (this.counter);
        this.counter++;
    }
    
    public void display(){
        System.out.println("Student Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Registration No: " + this.regNo);
        System.out.println("Year of joining: " + this.yearOfJoining);
    }
    
}
