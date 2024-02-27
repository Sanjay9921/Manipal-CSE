package l8q5;

public class L8Q5 {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Producer p1 = new Producer(f);
        Consumer c1 = new Consumer(f);
        
        p1.start();
        c1.start();
    }
    
}
