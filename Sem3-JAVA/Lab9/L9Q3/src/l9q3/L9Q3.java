package l9q3;

import Stack.*; // custom stack package created for generic stack class and custom exception classes

public class L9Q3 {
    public static void main(String[] args) throws StackOverFlow, StackUnderFlow{
        GenStack<Integer> s1 = new GenStack<>(10);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.display();
        System.out.println("Pop:= " + s1.pop());
        s1.display();
        
        GenStack<String> s2 = new GenStack<>(10);
        s2.push("I");
        s2.push("Am");
        s2.push("Ryan");
        s2.push("Gosling");
        s2.display();
        System.out.println("Pop:= " + s2.pop());
        s2.display();
    }
    
}
