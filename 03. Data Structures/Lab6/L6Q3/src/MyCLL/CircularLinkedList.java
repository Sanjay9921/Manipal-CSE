package MyCLL;

public class CircularLinkedList {
    public Node head;
    
    public CircularLinkedList(){
        this.head = null;
    }
    
    public void insert(int x){
        Node t = new Node(x);
        if(head == null){
            head = t;
            head.next = head; // self circularity
        }
        else{
            t.next = head.next;
            head.next = t;
            head = t;
        }
    }
    
    public void display(){
        if(head == null){
            System.out.println("Circular Linked List is empty!");
            return;
        }
        
        Node p = head.next;
        do{
            System.out.print(p.getData() + " ");
            p = p.next;
        }while(p!=head.next);
        
        System.out.println();
    }
    
    public Node getHead(){
        return this.head;
    }
}
