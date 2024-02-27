package l8q1;

public class RunnableThreadDemo implements Runnable{
    Thread t;

    public RunnableThreadDemo(){
        this.t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + this.t);
        this.t.start();
    }
    
    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child interrupted...");
            
        }
        
        System.out.println("Exiting child thread...");
        
    }
    
}
