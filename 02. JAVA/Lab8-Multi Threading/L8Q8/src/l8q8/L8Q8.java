package l8q8;

public class L8Q8 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter, "INC");
        CounterThread t2 = new CounterThread(counter, "DEC");
        
        t1.start();
        t2.start();
    }
    
}
