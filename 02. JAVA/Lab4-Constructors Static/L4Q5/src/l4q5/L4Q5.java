package l4q5;

import java.util.*;

class BankAccount{
    
    // instance variables
    String acctName;
    String acctNo;
    String acctType;
    double acctBal;
    static double roi = 5.0;
    
    public BankAccount(){
        this.acctName = "John Doe";
        this.acctNo = "123456789";
        this.acctType = "Savings";
        this.acctBal = 0.0;
    }
    
    public BankAccount(String acctName, String acctNo, String acctType, double acctBal){
        this.acctName = acctName;
        this.acctNo = acctNo;
        this.acctType = acctType;
        this.acctBal = acctBal;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Enter the full name of the account holder: ");
        this.acctName = sc.nextLine();
        
        System.out.println("2. Enter account number: ");
        this.acctNo = sc.nextLine();
        
        System.out.println("3. Enter Balance: ");
        this.acctBal = sc.nextDouble();
        
        System.out.println("4. Enter account type (Savings/Current): ");
        this.acctType = sc.next(); // not nextLine()
    }
    
    public void deposit(int amount){
        this.acctBal += amount;
    }
    
    public void withdraw(int amount){
        if(this.acctBal<amount){
            System.out.println("You broke. Enter an amount that is less than or equal to your current balance: " + this.acctBal);
        }
        else{
            this.acctBal -= amount;
        }
    }
    
    public void display(){
        System.out.println("Bank Details of " + this.acctName);
        System.out.println("Account Number: " + this.acctNo);
        System.out.println("Account Type: " + this.acctType);
        System.out.println("Account Balance: " + this.acctBal);
    }
    
    public static double getROI(){
        return roi;
    }
}

public class L4Q5 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.input();
        ba1.deposit(150000);
        ba1.withdraw(1000);
        ba1.display();
    }
    
}
