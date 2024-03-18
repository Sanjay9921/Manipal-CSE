package l4q2;

import MyCircularQueue.*;

public class L4Q2 {
    public static void main(String[] args) throws Exception{
        CircularQueue cq1 = new CircularQueue(5);
        cq1.enqueue(10);
        cq1.enqueue(20);
        cq1.enqueue(30);
        
        System.out.println(cq1.peek()); // 10
        System.out.println(cq1.dequeue()); // 10
        System.out.println(cq1.peek()); // 20
    }
    
}
