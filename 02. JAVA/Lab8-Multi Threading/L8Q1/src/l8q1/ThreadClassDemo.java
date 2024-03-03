package l8q1;

public class ThreadClassDemo extends Thread{
    public ThreadClassDemo(){
        super("Demo Thread");
        System.out.println("Child Thread: " + this); // notice there is no Thread t -> this.t
        start(); // notice there is no t.start()
    }
    
    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child thread interrupted...");
        }
    }
}
