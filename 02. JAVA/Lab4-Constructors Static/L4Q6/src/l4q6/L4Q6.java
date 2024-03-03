package l4q6;

class Counter{
    static int count=0;
    Counter(){
        this.count+=1;
    }
    
    public static void showCount(){
        System.out.println("I detect " + count + " counter object(s) created.");
    }
}

public class L4Q6 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.showCount();
        
        Counter c2 = new Counter();
        c2.showCount();
        c1.showCount();
    }
    
}
