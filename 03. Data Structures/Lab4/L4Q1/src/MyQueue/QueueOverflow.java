package MyQueue;

public class QueueOverflow extends Exception{
    public QueueOverflow(){
        System.out.println("Queue Overflow!");
    }
    
    public QueueOverflow(String errMsg){
        super(errMsg);
    }
}
