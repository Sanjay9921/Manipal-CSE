package l9q5;

import LinkedList.*; // custom package for custom generic linked list

public class L9Q5 {
    public static void main(String[] args) {
        GenList<Integer> l1 = new GenList<>();
        GenList<Double> l2 = new GenList<>();
        GenList<String> l3 = new GenList<>();
        
        // Integer List
        l1.insertFront(10);
        l1.insertFront(20);
        l1.insertRear(30);
        System.out.println(l1); // toString
        
    }
    
}