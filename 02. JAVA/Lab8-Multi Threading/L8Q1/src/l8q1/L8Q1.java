package l8q1;

public class L8Q1 {
    public static void main(String[] args) {
        // 1. Runnable Interface
        // useful when in need of multiple inheritance
        System.out.println("************************1. Runnable Interface************************");
        new RunnableThreadDemo();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted...");
        }
        System.out.println("Main Thread Exiting...");
        
        // 2. Extending Thread class
        System.out.println("************************2. Thread Class************************");
        new ThreadClassDemo();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted...");
        }
        System.out.println("Main Thread Exiting...");
    }
    
}
