package l8q2;

class NewThread implements Runnable{
    Thread t;
    String threadName;

    public NewThread(String threadName){
        this.threadName = threadName;
        this.t = new Thread(this, "Demo Thread");
        System.out.println("New Thread: " + this.t);
        this.t.start();
    }
    
    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println(this.threadName + " > " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(this.threadName + " interrupted...");
            
        }
        
        System.out.println(this.threadName + " exiting...");   
    }
}

public class L8Q2 {
    public static void main(String[] args) {
        new NewThread("Thread One");
        new NewThread("Thread Two");
        new NewThread("Thread Three");
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted...");
        }
        
        System.out.println("Main thread exiting...");
    }
}
