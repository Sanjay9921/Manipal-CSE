package l8q5;

import java.util.*;

public class Consumer extends Thread{
    private Fruit fruit;
    
    public Consumer(Fruit fruit){
        this.fruit = fruit;
    }
    
    @Override
    public void run(){
        int start=0;
        
        do{
            fruit.consume();
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Producer interrupted...");
            }
            start++;
        }while(start < fruit.getQuantity());
    }
}
