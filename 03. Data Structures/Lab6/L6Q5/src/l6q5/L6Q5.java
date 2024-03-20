package l6q5;

import MySLL.*;

public class L6Q5 {

    public static Node reverseLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        Node result = reverseLL(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return result;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for(int i=5;i>=1;i--){
            list.insert(i);
        }
        
        list.display();
        
        Node result = reverseLL(list.getHead());
        list.setHead(result);
        
        list.display();
    }
    
}
