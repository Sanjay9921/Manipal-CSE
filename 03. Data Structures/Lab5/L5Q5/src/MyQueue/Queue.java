package MyQueue;

public class Queue {
    int front;
    int rear;
    int size;
    int[] queue;
    
    public Queue(int size){
        this.size = size;
        queue = new int[this.size];
        front = rear = -1;
    }
    
    public boolean isFull(){
        return rear == size-1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    // Insert an element to the queue
    // Also known as AddFirst
    public void enqueue(int x) throws QueueOverflow{
        if(isFull()){
            throw new QueueOverflow();
        }
        
        queue[++rear] = x;
        if(front==-1){
            front = 0;
        }
    }
    
    // Delete an element from the queue
    public int dequeue() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        int x = queue[front++];
        if(front > rear){
            front = rear = -1; // Reset both if queue is empty
        }
        
        return x;
    }
    
    public void display() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }
}
