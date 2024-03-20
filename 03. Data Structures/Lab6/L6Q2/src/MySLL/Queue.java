package MySLL;

public class Queue {
    private Node front;
    private Node rear;
    
    public Queue(){
        this.front = this.rear = null;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void enqueue(int x){
        Node t = new Node(x);
        if(isEmpty()){
            front = t;
            rear = t;
        }
        else{
            rear.next = t;
            rear = t;
        }
    }
    
    public int dequeue() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        int x = front.data;
        if(front == rear){
            front = rear = null;
        }
        else{
            front = front.next;
        }
        
        return x;
    }
    
    public int peek() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        return front.data;
    }
    
    public void display() throws QueueUnderflow{
        if(isEmpty()){
            throw new QueueUnderflow();
        }
        
        Node p = front;
        while(p!=null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        
        System.out.println();
    }
}
