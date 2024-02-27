package l8q5;

import java.util.*;

public class Producer extends Thread{
    Fruit fruit;
    
    public Producer(Fruit fruit){
        this.fruit = fruit;
    }
    
    @Override
    public void run(){
        List<String> fruits = new ArrayList<String>(0);
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pears");
        
        fruit.setQuantity(fruits.size());
        
        for(String f:fruits){
            fruit.produce(f);
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Producer interrupted...");
            }
        }
    }
}
