package l6q2;

import MySLL.*;

public class L6Q2 {
    public static void main(String[] args) throws Exception{
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.peek()); // 10
        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek()); // 20
    }
}
