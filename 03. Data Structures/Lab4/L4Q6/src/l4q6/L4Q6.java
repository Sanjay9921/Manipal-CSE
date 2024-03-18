package l4q6;

import NQueue.*;

public class L4Q6 {
    public static void main(String[] args) {
        int N = 3; // Number of queues
        int capacity = 9; // Total capacity of the array
        NCircularQueue queues = new NCircularQueue(N, capacity);

        queues.enqueue(0, 1);
        queues.enqueue(0, 2);
        queues.enqueue(1, 3);
        queues.enqueue(2, 4);

        System.out.println("Dequeue from queue 0: " + queues.dequeue(0));
        System.out.println("Dequeue from queue 1: " + queues.dequeue(1));
        System.out.println("Dequeue from queue 2: " + queues.dequeue(2));
    }
    
}
