package l5q1;

import MyDQ.*;

public class L5Q1 {
    public static void main(String[] args) throws Exception{
        Deque deque = new Deque(5);
        deque.addLeft(5);
        deque.addLeft(10);
        deque.addRight(15);
        deque.display(); // Output: Deque: 10 5 15
        System.out.println("Deleted from left: " + deque.deleteLeft()); // Output: Deleted from left: 10
        deque.display(); // Output: Deque: 5 15
        System.out.println("Deleted from right: " + deque.deleteRight()); // Output: Deleted from right: 15
        deque.display(); // Output: Deque: 5
    }
    
}
