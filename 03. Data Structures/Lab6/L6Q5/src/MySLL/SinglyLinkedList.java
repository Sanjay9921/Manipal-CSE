package MySLL;

public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList(){
        head = null;
    }
    
    public void insert(int x){
        Node t = new Node(x);
        if(head==null){
            head = t;
        }
        else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            
            p.next = t;
        }
    }
    
    public void display(){
        Node p = head;
        while(p!= null){
            System.out.print(p.getData() + " ");
            p = p.next;
        }
        System.out.println();
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public void setHead(Node newHead){
        this.head = newHead;
    }
}
