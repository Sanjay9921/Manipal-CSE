package l7q4;

import MyDCLL.Node;
import MyDCLL.DoublyCircularLinkedList;

public class L7Q4 {
    public static Node reverseDCLL(Node head){
        DoublyCircularLinkedList result = new DoublyCircularLinkedList();
        Node p = head.prev;
        do{
            result.insert(p.data);
            p = p.prev;
        }while(p!=head.prev);
        
        return result.getHead();
    }
    
    public static void main(String[] args) {
        DoublyCircularLinkedList a = new DoublyCircularLinkedList();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.display();
        
        Node result = reverseDCLL(a.getHead());
        DoublyCircularLinkedList.display(result);
    }
}
