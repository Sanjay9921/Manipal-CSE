package l7q3;

class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class CheckingAccount{
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance -= amount;
        }
        else{
            double requires = amount - balance;
            throw new InsufficientFundsException(requires);
        }
    }
}

public class L7Q3 {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(101);
        double amount = 500;
        System.out.println("Depositing: $" + amount);
        ca.deposit(amount);
        
        try{
            amount = 1000;
            System.out.println("Withdrawing: $" + amount);
            ca.withdraw(amount);
            
            amount = 500;
            System.out.println("Withdrawing: $" + amount);
            ca.withdraw(amount);
        }
        catch(InsufficientFundsException e){
            System.out.println("Sorry, you are short of: $" + e.getAmount());
        }
    }
}
