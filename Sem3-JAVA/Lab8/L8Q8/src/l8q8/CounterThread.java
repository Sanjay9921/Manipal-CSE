package l8q8;

import java.util.*;

public class CounterThread extends Thread{
    Random random;
    Counter counter;
    String choice;
    
    public CounterThread(Counter counter, String choice){
        random = new Random();
        this.counter = counter;
        this.choice = choice;
    }
    
    @Override
    public void run(){
        if(choice=="INC"){
            for(int i=0;i<20;i++){
                counter.increment();
                try{
                    int randomMS = random.nextInt(500);
                    sleep(randomMS);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        else{
            for(int i=0;i<20;i++){
                counter.decrement();
                try{
                    int randomMS = random.nextInt(500);
                    sleep(randomMS);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
