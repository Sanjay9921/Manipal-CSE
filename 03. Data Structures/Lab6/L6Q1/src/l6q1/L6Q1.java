package l6q1;

import MySLL.*;

public class L6Q1 {
    public static void main(String[] args) throws Exception{
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        
        System.out.println(s1.peek()); // 30
        System.out.println(s1.pop()); // 30
        System.out.println(s1.peek()); // 20
    }
    
}
