package l7q7;

import java.util.Set;

public class L7Q7 {
    public static void main(String[] args) {
        ByTwos bt1 = new ByTwos();
        bt1.setStart(7);
        System.out.println(bt1.getNext());
        System.out.println(bt1.getNext());
        System.out.println(bt1.getNext());
        bt1.reset();
        System.out.println(bt1.getNext());
    }
    
}
