package l8q6;

public class L8Q6 {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority("Thread1");
        ThreadPriority t2 = new ThreadPriority("Thread2");
        ThreadPriority t3 = new ThreadPriority("Thread3");
        
        System.out.println("Thread1 priority: " + t1.getPriority());
        System.out.println("Thread2 priority: " + t2.getPriority());
        System.out.println("Thread3 priority: " + t3.getPriority());
        
        // Thread priorities between 1 and 10
        // Default Priority = 5
        
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        
        System.out.println("Thread1 priority: " + t1.getPriority());
        System.out.println("Thread2 priority: " + t2.getPriority());
        System.out.println("Thread3 priority: " + t3.getPriority());
        
        System.out.println("Main Thread: ");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
    
}
