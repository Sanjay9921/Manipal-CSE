package l5q1;

import java.util.*;
import java.text.*;

class Student{
    private int regno;
    private String fullName;
    private GregorianCalendar doj;
    private short semester;
    private float gpa;
    private float cgpa;
    
    Student(){}
    
    Student(int regno, String fullName, GregorianCalendar doj, short semester, float gpa, float cgpa){
        this.regno = regno;
        this.fullName = fullName;
        this.doj = doj;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Input: ");
        
        System.out.println("1. Enter Student Name: ");
        this.fullName = sc.nextLine();
        
        System.out.println("2. Enter Date of joining (YYYY MM DD): ");
        this.doj = new GregorianCalendar(sc.nextInt(), sc.nextInt()-1, sc.nextInt());
        
        System.out.println("3. Enter Semester: ");
        this.semester = sc.nextShort();
        
        System.out.println("4. Enter GPA: ");
        this.gpa = sc.nextFloat();
        
        System.out.println("5. Enter CGPA: ");
        this.cgpa = sc.nextFloat();
    }
    
    public void display(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy"); // java.text.*
        System.out.println("Name: " + this.fullName);
        System.out.println("Registration #: " + this.regno);
        System.out.println("Date Joined: " + sdf.format(doj.getTime()));
        System.out.println("Semester: " + this.semester);
        System.out.println("GPA: " + this.gpa);
        System.out.println("CGPA: " + this.cgpa);
    }
    
    public GregorianCalendar getDOJ(){
        return this.doj;
    }
    
    public short getSemester(){
        return this.semester;
    }
    
    public String getName(){
        return this.fullName;
    }
    
    public float getCGPA(){
        return this.cgpa;
    }
    
    public void setRegNo(int regno){
        this.regno = regno;
    }
    
    public String shortenName(){
        String name = this.fullName; // FirstName MiddleName LastName(Family)
        String shortName="";
        String[] strArr = name.split(" ");
        for(int i=0;i<strArr.length-1;i++){
            shortName += strArr[i].charAt(0) + ". ";
        }
        shortName += strArr[strArr.length-1];
        
        return shortName;
    }
}

class Students{
    int size;
    Student student[];
    
    public Students(){}
    
    public Students(int size){
        this.size = size;
        student = new Student[size];
    }
    
    public void inputAll(){
        for(int i=0;i<size;i++){
            System.out.println("Student #: " + (i+1));
            student[i] = new Student();
            student[i].input();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yy");
            String reg = sdf.format(student[i].getDOJ().getTime()) + String.format("%02d", (i+1));
            student[i].setRegNo(Integer.parseInt(reg));
        }
    }
    
    public void displayAll(){
        System.out.println("Students Details");
        for(Student s: student){
            s.display();
        }
    }
    
    public void customSort(String cmp){
        for(int i=0;i<this.size-1;i++){
            int min = i;
            for(int j=i+1;j<this.size;j++){
                
                if(cmp.equals("semester") && (student[j].getSemester() < student[min].getSemester())){
                    min = j;
                }
                
                if(cmp.equals("name") && (student[j].getName().compareTo(student[min].getName()))>0){
                    min = j;
                }
                
                if(cmp.equals("cgpa") && (student[j].getCGPA() < student[min].getCGPA())){
                    min = j;
                }
            }
            if(min!=i){
                Student s = student[i];
                student[i] = student[min];
                student[min] = s;
            }
        }
    }
    
    public void namesWithStartingChar(char ch){
        for(Student s : student){
            if(s.getName().indexOf(ch)==0){
                s.display();
            }
        }
    }
    
    public void namesWithSubstring(String sub){
        for(Student s : student){
            if(s.getName().contains(sub)){
                s.display();
            }
        }
    }
    
    public void namesShorted(){
        for(Student s : student){
            System.out.println(s.shortenName());
        }
    }
    
}

public class L5Q1 {
    public static void main(String[] args) {
        int size = 2;
        Students s = new Students(size);
        s.inputAll();
        s.displayAll();
        
        // s.customSort("cgpa");
        // System.out.println("After Sorting...");
        // s.displayAll();
        
        s.namesShorted();
    }
    
}
