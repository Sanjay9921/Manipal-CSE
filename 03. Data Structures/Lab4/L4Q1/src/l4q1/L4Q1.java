package l4q1;

import MyQueue.*;

public class L4Q1 {
    public static void main(String[] args) throws Exception{
        Queue q1 = new Queue(5);
        for(int i=10;i<50;i+=10){
            q1.enqueue(i);
        }
        
        q1.display();
        
        System.out.println("Dequeue" + q1.dequeue());
        
        q1.display();
        
    }
    
}
