package l3q2;

import java.util.*;

class Complex{
    // a+ib
    int a;
    int b;
    
    // Constructor
    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString(){
        return this.a + "+i" + this.b;
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

public class L3Q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,10);
        System.out.println("C1:= " + c1.toString());
        
        Complex c2 = new Complex(10,15);
        System.out.println("C2:= " + c2.toString());
        
        Complex c3 = c1.add(c2);
        System.out.println("C3:= " + c3.toString());
    }
    
}
