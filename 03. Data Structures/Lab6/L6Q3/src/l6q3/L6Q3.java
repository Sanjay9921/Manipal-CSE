package l6q3;

import MyCLL.*;

public class L6Q3 {
    
    public static CircularLinkedList mergeCLL(Node head1, Node head2){
        
        CircularLinkedList result = new CircularLinkedList();

        Node p1 = head1.next;
        Node p2 = head2.next;
        
        while(p1!=head1 && p2!=head2){
            if(p1.getData() < p2.getData()){
                result.insert(p1.getData());
                p1 =  p1.next;
            }
            else{
                result.insert(p2.getData());
                p2 =  p2.next;
            }
        }
        
        while(p1!=head1.next && p2!=head2.next){
            if(p1.getData() < p2.getData()){
                result.insert(p1.getData());
                p1 =  p1.next;
            }
            else{
                result.insert(p2.getData());
                p2 =  p2.next;
            }
        }
        
        while(p1!=head1.next){
            result.insert(p1.getData());
            p1 =  p1.next;
        }
        
        while(p2!=head2.next){
            result.insert(p2.getData());
            p2 =  p2.next;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        CircularLinkedList c1 = new CircularLinkedList();
        CircularLinkedList c2 = new CircularLinkedList();
        
        c1.insert(0);
        c1.insert(2);
        c1.insert(7);
        c1.insert(8);
        
        c2.insert(1);
        c2.insert(3);
        c2.insert(5);
        
        CircularLinkedList result = mergeCLL(c1.getHead(), c2.getHead());
        result.display();
    }
    
}
