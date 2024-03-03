package l8q5;

public class Fruit {
    String fruit;
    int quantity;
    boolean available = false;
    
    public synchronized void produce(String fruit){
        
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Producer interrupted...");
            }
        }
        
        this.fruit = fruit;
        System.out.println("Producer has produced: " + fruit);
        available = true;
        
        notify();
    }
    
    public synchronized void consume(){
        
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Consumer interrupted...");
            }
        }
        
        available = false;
        System.out.println("Consumer has consumed: " + this.fruit);
        this.fruit = " ";
        
        notify();
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
