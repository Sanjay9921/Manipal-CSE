package MyCircularQueue;

public class QueueUnderflow extends Exception{
    public QueueUnderflow(){
        System.out.println("Queue Underflow!");
    }
    
    public QueueUnderflow(String errMsg){
        super(errMsg);
    }
}
