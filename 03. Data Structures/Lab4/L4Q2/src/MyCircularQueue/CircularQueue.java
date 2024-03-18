package MyCircularQueue;

public class CircularQueue {
    int front;
    int rear;
    int size;
    int[] cqueue;
    
    public CircularQueue(int size){
        front = rear = -1;
        this.size = size;
        cqueue = new int[this.size];
    }
    
    public boolean isEmpty(){
        return front==-1;
    }
    
    public boolean isFull(){
        return front == (rear+1)%size;
    }
    
    public void enqueue(int x) throws QueueOverflow{
        if(isFull()){
            throw new QueueOverflow();
        }
        
        if(isEmpty()){
            front = 0;
        }
        
        rear = (rear+1)%size;
        cqueue[rear] = x;
    }
    
    public int dequeue() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        int x = cqueue[front];
        
        if(front==rear){
            front = rear = -1; // reset
        }
        else{
            front = (front+1)%size;
        }
        
        return x;
    }
    
    public int peek() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        return cqueue[front];
    }
}
