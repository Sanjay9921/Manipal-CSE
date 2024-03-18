package l5q2;

import MyPQ.*;

public class L5Q2 {
    public static void main(String[] args) throws Exception{
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(5);
        priorityQueue.insert(3);
        priorityQueue.insert(7);
        priorityQueue.insert(2);
        priorityQueue.insert(9);
        priorityQueue.display(); // Output: Priority Queue (ascending): 2 3 7 5 9
        System.out.println("Removed item: " + priorityQueue.remove()); // Output: Removed item: 2
        priorityQueue.display(); // Output: Priority Queue (ascending): 3 5 7 9
    }
    
}
