package l7q2;

import MySCL.*;

public class L7Q2 {
    public static void main(String[] args) {
        SingularCircularLinkedList a = new SingularCircularLinkedList();
        a.insert(1);
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.display();
        
        SingularCircularLinkedList b = new SingularCircularLinkedList();
        b.insert(1);
        b.insert(3);
        b.insert(4);
        b.display();
        
        Node result = a.union(b.getHead());
        SingularCircularLinkedList.display(result);
        
        Node result2 = a.intersection(b.getHead());
        SingularCircularLinkedList.display(result2);
    }
    
}
