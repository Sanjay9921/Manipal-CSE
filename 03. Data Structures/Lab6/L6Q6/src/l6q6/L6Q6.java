package l6q6;

import MySLL.*;

public class L6Q6 {
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insert(-1); // dummy node
        s1.insert(1);
        s1.insert(2);
        s1.insert(3);
        
        SinglyLinkedList s2 = new SinglyLinkedList();
        s2.insert(-1); // dummy node
        s2.insert(2);
        s2.insert(3);
        s2.insert(4);
        
        SinglyLinkedList resUnion1 = SLLSetWithHeader.union(s1.getHead(), s2.getHead());
        resUnion1.display();
        
    }
    
}
