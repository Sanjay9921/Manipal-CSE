package l4q3;

import java.util.*;

class Complex{
    // a+ib
    double a;
    double b;
    
    // Default Constructor
    public Complex(){
        this.a = this.b = 0.0;
    }
    
    // Parameterized Constructor
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public void display(){
        System.out.println(this.a + "+i" + this.b);
    }
    
    public Complex add(Complex c2){
        Complex result = new Complex(this.a, this.b);
        result.a += c2.a;
        result.b += c2.b;
        
        return result;
    }
    
    public Complex subtract(Complex c2){
        Complex result = new Complex(this.a, this.b);
        result.a -= c2.a;
        result.b -= c2.b;
        
        return result;
    }
}

public class L4Q3{
    public static void main(String[] args) {
        Complex c1 = new Complex(5,10);
        c1.display();
        
        Complex c2 = new Complex(10,15);
        c2.display();
        
        Complex c3 = c1.add(c2);
        c3.display();
    }
    
}
