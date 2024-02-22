package l4q7;

import java.util.*;

class Customer{
    private String custID;
    private String custName;
    private double creditLimit;
    
    public Customer(){
        this.custID = "1234";
        this.custName = "John Doe";
        this.creditLimit = 0.0;
    }
    
    public Customer(String custID, String custName, double creditLimit){
        this.custID = this.custID;
        this.custName = this.custName;
        this.creditLimit = this.creditLimit;
    }
    
    public void setID(String custID){
        this.custID = custID;
    }
    
    public void setName(String custName){
        this.custName = custName;
    }
    
    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }
    
    public void display(){
        System.out.println("xxxxxxxWelcome to ABC Bankxxxxxxx");
        System.out.println("Details of " + this.custName);
        System.out.println("Customer ID: " + this.custID);
        System.out.println("Credit Limit: " + this.creditLimit);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}

public class L4Q7 {
    public static void main(String[] args) {
        
        int n = 2;
        Customer[] custArr = new Customer[n]; // change it to 5 as per the q, too many inputs fried my brain today
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Customer " + (i+1));
            custArr[i] = new Customer();
            
            System.out.println("1. Enter Customer Name: ");
            custArr[i].setName(sc.nextLine());
            
            System.out.println("2. Enter Customer ID: ");
            custArr[i].setID(sc.nextLine());
            
            System.out.println("3. Enter Credit Limit for the current cusomter: ");
            custArr[i].setCreditLimit(sc.nextDouble());
            sc.nextLine();
        }
        
        System.out.println("Details of all 5 customers: ");
        for(Customer c : custArr){
            c.display();
        }
    }
    
}
