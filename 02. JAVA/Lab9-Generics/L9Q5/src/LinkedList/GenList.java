package LinkedList;

public class GenList<T> {
    Node<T> head;
    
    public void insertFront(T data){
        Node<T> t = new Node<>(data);
        if(head==null){
            head = t;
        }
        else{
            t.next = head;
            head = t;
        }
    }
    
    public void insertRear(T data){
        Node<T> t = new Node<>(data);
        if(head==null){
            head = t;
        }
        else{
            Node<T> curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            
            curr.next = t;
        }
    }
    
    public T deleteFront(){
        if(head == null){
            return null;
        }
        
        T data = head.data;
        head = head.next;
        return data;
    }
    
    public T deleteRear(){
        if(head == null){
            return null;
        }
        
        Node<T> curr = head;
        Node<T> prev = head;
        while(curr.next!=head){
            prev = curr;
            curr = curr.next;
        }
        
        T data = curr.data;
        prev.next = null;
        return data;
    }
    
    @Override
    public String toString(){
        String str = "\t";
        Node<T> p = head;
        while(p.next != null){
            str += p.data + "->";
            p = p.next;
        }
        
        str += p.data;
        
        return str;
    }
}
