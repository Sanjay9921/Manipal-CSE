package l4q1;

class Student{
    int id;
    String name;
    
    // default constructor
    public Student(){
        System.out.println("Default Constructor");
        System.out.println("Default values of id:= " + this.id + " and name:= " + this.name);
    }
    
    // parameterized constructor
    public Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor");
        System.out.println("Values of id:= " + this.id + " and name:= " + this.name);
    }
}

public class L4Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1001, "Ryan Gosling");
    }
}
