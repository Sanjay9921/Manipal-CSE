package l4q4;

import java.util.Queue;
import java.util.LinkedList;

public class L4Q4 {
    public static boolean queueContainsElement(Queue<Integer> q, int key){
        int n = q.size();
        
        for(int i=0;i<n;i++){
            int x = q.poll(); // removes front element and saves a temp copy
            q.offer(x); // adds the element back to the queue to maintain in-oder
            
            if(key == x){
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // Queue is abstract
        for(int i=1;i<=5;i++){
            q.offer(i);
        }
        
        int key = 4;
        if(queueContainsElement(q, key)){
            System.out.println("Element " + key + " has been found!");
        }
        else{
            System.out.println("Element " + key + " does not exist!");
        }
        
    }
    
}
