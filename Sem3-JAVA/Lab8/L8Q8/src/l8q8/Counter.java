package l8q8;

public class Counter {
    private int count = 0;
    
    public synchronized void increment(){
        while(count>=3){
            try{
                System.out.println("Waiting for decrement...");
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        count++;
        System.out.println("Incremented counter to: " + count);
        
        notify();
    }
    
    public synchronized void decrement(){
        while(count<=0){
            try{
                System.out.println("Waiting for increment...");
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        count--;
        System.out.println("Decremented counter to: " + count);
        
        notify();
    }
}
