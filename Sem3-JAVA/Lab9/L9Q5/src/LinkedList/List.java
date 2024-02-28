package LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    
    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class List<T> {
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
        if(head)
    }
}
