package RestrictedQ;

import java.util.ArrayDeque;

public class OutputRestrictedDQ {
    private int size;
    private int front, rear;
    private int[] dq;
    
    public OutputRestrictedDQ(int size){
        this.size = size;
        front = -1;
        rear = 0;
        dq = new int[this.size];
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public boolean isFull(){
        return (front == 0 && rear == (size-1)) || (front == rear + 1);
    }
    
    public void addLeft(int x) throws QueueOverflow{
        if(isFull()){
            throw new QueueOverflow();
        }
        
        if(front==-1){
            front = 0;
        }
        else if(front==0){
            front = size-1;
        }
        else{
            front--;
        }
        
        dq[front] = x;
    }
    
    // Usual enqueue
    public void addRight(int x) throws QueueOverflow{
        if(isFull()){
            throw new QueueOverflow();
        }
        
        if(front==-1){
            front = 0;
        }
        
        rear = (rear+1)%size;
        
        dq[front] = x;
    }
    
    // Usual dequeue
    public int deleteLeft() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        int x= dq[front];
        
        if(front == rear){
            front = rear = -1; // reset
        }
        else{
            front = (front+1)%size;
        }
        
        return x;
    }
    
    // no deleteRight() allowed
    
    public void display() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        int i=front;
        do {
            System.out.print(dq[i] + " ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);
        System.out.println();
    }
}