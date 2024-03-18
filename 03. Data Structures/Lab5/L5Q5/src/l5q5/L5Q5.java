package l5q5;

import MyQueue.*;

public class L5Q5 {
    
    public static void reverseQ(Queue q) throws Exception{
        int x = q.dequeue();
        
        if(!q.isEmpty()){
            reverseQ(q);
        }
        
        q.enqueue(x);
    }
    public static void main(String[] args) throws Exception{
        Queue q = new Queue(5);
        for(int i=5;i>=1;i--){
            q.enqueue(i);
        }
        
        q.display();
        
        reverseQ(q);
        
        q.display();
    }
    
}
