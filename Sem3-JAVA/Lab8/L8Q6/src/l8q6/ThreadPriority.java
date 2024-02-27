package l8q6;

public class ThreadPriority extends Thread{
    String tname;
    public ThreadPriority(String tname){
        this.tname = tname;
    }
    
    @Override
    public void run(){
        System.out.println("Thread (" + tname + ") run method...");
    }
}
