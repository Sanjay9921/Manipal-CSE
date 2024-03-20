package l6q4;

import MySLL.*;

public class L6Q4 {
    public static void deleteDuplicates(Node head){
        if(head==null){
            return ;
        }
        
        Node curr = head;
        while(curr!=null){
            Node next = curr;
            while(next!=null && next.getData() == curr.getData()){
                next = next.next;
            }
            
            curr.next = next;
            curr = next;
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for(int i=1;i<=5;i++){
            for(int j=1;j<i+1;j++){
                list.insert(i);
            }
        }
        
        list.display();
        
        deleteDuplicates(list.getHead());
        
        list.display();
    }
    
}
