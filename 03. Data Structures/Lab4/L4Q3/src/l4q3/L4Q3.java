package l4q3;

import MyCircularQueue.*;

public class L4Q3 {
    public static void main(String[] args) throws Exception{
        // Two Circular Queues onto a single array
        CircularQueue cq1 = new CircularQueue(10);
        cq1.enqueue(1, 10);
        cq1.enqueue(1, 20);
        cq1.enqueue(1, 30);
        cq1.enqueue(1, 40);
        
        System.out.println(cq1.peek(1)); // 10
        
        cq1.enqueue(2, 40);
        cq1.enqueue(2, 50);
        cq1.enqueue(2, 60);
        cq1.enqueue(2, 60);
        
        System.out.println(cq1.peek(2)); // 40
    }
    
}
