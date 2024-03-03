package l8q3;

public class TableThread extends Thread{
    int n;
    TableThread(int n){
        super("Multiplication table of: " + n);
        this.n = n;
        start();
    }
    
    @Override
    public synchronized void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(n + "*" + i + "=" + (n*i));
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted...");
        }
        
        System.out.println("Exiting thread for: " + this.n);
    }
}
