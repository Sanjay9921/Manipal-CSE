package l6q7;

import MyCLL.*;

public class L6Q7 {
    public static Node createCLL(int n){
        if(n<=0){
            return null;
        }
        
        CircularLinkedList c1 = new CircularLinkedList();
        for(int i=1;i<=n;i++){
            c1.insert(i);
        }
        
        return c1.getHead();
    }
    
    public static int josephusSurvivor(Node head, int k){
        if(head == null || k<=0){
            return -1;
        }
        
        Node p = head;
        while(p.next != p){
            for(int i=1;i<k-1;i++){
                p = p.next;
            }
            
            System.out.println("Elimination: " + p.next.getData());
            p.next = p.next.next; // eliminate the kth node
            
            p = p.next;
        }
        
        return p.getData();
    }
    
    public static void main(String[] args) {
        int n = 7; // total number of people
        int k = 3; //  counting interval
        
        Node head = createCLL(n);
        System.out.println("Head: " + head.getData());
        int survivor = josephusSurvivor(head, k);
        System.out.println("Choose the place: " + survivor);
        
    }
    
}
