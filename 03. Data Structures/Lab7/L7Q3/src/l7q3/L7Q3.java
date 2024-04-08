package l7q3;

import MyDCLL.Node;
import MyDCLL.DoublyCircularLinkedList;

public class L7Q3 {
    public static void main(String[] args) {
        DoublyCircularLinkedList a = new DoublyCircularLinkedList();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.display();
        System.out.println(a.getHead().data);
        System.out.println(a.getHead().prev.data);
        
        DoublyCircularLinkedList b = new DoublyCircularLinkedList();
        b.insert(1);
        b.insert(2);
        b.display();
        System.out.println(b.getHead().data);
        System.out.println(b.getHead().prev.data);
        
        Node result = a.addLongInt(b.getHead());
        DoublyCircularLinkedList.display(result);
    }
    
}
