package MySLL;

public class SLLSetWithHeader extends SinglyLinkedList{
    public static SinglyLinkedList union(Node list1, Node list2){
        SinglyLinkedList result = new SinglyLinkedList();
        // result.insert(-1); // dummy header node
        
        Node p1 = list1.next; // skipping the header node
        Node p2 = list2.next; // skipping the header node
        
        while(p1!=null && p2!=null){
            if(p1.getData() < p2.getData()){
                result.insert(p1.getData());
                p1 = p1.next;
            }
            else if(p1.getData() > p2.getData()){
                result.insert(p2.getData());
                p2 = p2.next;
            }
            else{
                result.insert(p1.getData());
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        while(p1!=null){
            result.insert(p1.getData());
            p1 = p1.next;
        }
        
        while(p2!=null){
            result.insert(p2.getData());
            p2 = p2.next;
        }
        
        return result;
    }
    
    public static SinglyLinkedList intersection(Node list1, Node list2){
        SinglyLinkedList result = new SinglyLinkedList();
        // result.insert(-1); // dummy header node
        
        Node p1 = list1.next; // skipping the header node
        Node p2 = list2.next; // skipping the header node
        
        while(p1!=null && p2!=null){
            if(p1.getData() < p2.getData()){
                p1 = p1.next;
            }
            else if(p1.getData() > p2.getData()){
                p2 = p2.next;
            }
            else{
                result.insert(p1.getData());
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        return result;
    }
    
    public static SinglyLinkedList difference(Node list1, Node list2){
        SinglyLinkedList result = new SinglyLinkedList();
        result.insert(-1); // dummy header node
        
        Node p1 = list1.next; // skipping the header node
        Node p2 = list2.next; // skipping the header node
        
        while(p1!=null && p2!=null){
            if(p1.getData() < p2.getData()){
                result.insert(p1.getData());
                p1 = p1.next;
            }
            else if(p1.getData() > p2.getData()){
                p2 = p2.next;
            }
            else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        while(p1!=null){
            result.insert(p1.getData());
            p1 = p1.next;
        }
        
        return result;
    }
}
