package l4q2;

import java.util.*;

class StaticClass{
    static int x = 10;
    static int staticMethod(){
        return x/2;
    }
}

public class L4Q2 {
    public static void main(String[] args) {
        System.out.println("Static value is: " + StaticClass.x);
        System.out.println("Static method is: " + StaticClass.staticMethod());
        
        StaticClass.x = 20;
        
        System.out.println("Static value is: " + StaticClass.x);
        System.out.println("Static method is: " + StaticClass.staticMethod());
    }
    
}
