package l7q5;

import java.util.Scanner;
import java.io.IOException;

public class Employee {
    private String name;
    private int age;
    private double grossSalary;
    private float takeHomeSalary;
    private char grade;
    
    // Constructors
    
    public Employee(){}

    public Employee(String name, int age, double grossSalary, float takeHomeSalary, char grade) {
        this.name = name;
        this.age = age;
        this.grossSalary = grossSalary;
        this.takeHomeSalary = takeHomeSalary;
        this.grade = grade;
    }
    
    // Other Methods
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputs for Employee...");
        
        try{
            System.out.println("Enter name: ");
            this.name = sc.nextLine();

            System.out.println("Enter age: ");
            int ageArg = Integer.parseInt(sc.nextLine());
            if(ageArg<18 || ageArg>75){
                throw new IOException();
            }
            else{
                this.age = ageArg;
            }

            System.out.println("Enter Gross Salary ($)");
            double grossArg = Double.parseDouble(sc.nextLine());
            if(grossArg < 0.0){
                throw new IOException();
            }
            else{
                this.grossSalary = grossArg;
            }

            System.out.println("Enter Take Home Salary ($)");
            float homeArg = Float.parseFloat(sc.nextLine());
            if(homeArg < 0.0f){
                throw new IOException();
            }
            else{
                this.takeHomeSalary = homeArg;
            }

            System.out.println("Enter Employee Grade: ");
            String gradeArg = sc.nextLine();
            // If input entered for grade is more than 1 character
            if(gradeArg.length() > 1){
                throw new IOException();
            }
            else{
                this.grade = gradeArg.charAt(0);
            }
        }
        catch(IOException e){
            System.out.println("IO Exception, please revalidate the keyboard input...");
            input();
        }
    }
    
    public void display(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
        System.out.println("Employee Gross Salary: $" + this.grossSalary);
        System.out.println("Employee Take Home Salary: $" + this.takeHomeSalary);
        System.out.println("Employee Grade: " + this.grade);
    }
}
