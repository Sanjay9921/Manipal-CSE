package MyDCLL;

public class DoublyCircularLinkedList {
    Node head;
    
    public void insert(int x){
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            head.next = head;
            head.prev = head;
        }
        else{
            Node p = head;
            while(p.next != head){
                p = p.next;
            }
            
            newNode.prev = p;
            newNode.next = p.next;
            p.next.prev = newNode;
            p.next = newNode;
        }
    }
    
    public void display(){
        if(head == null){
            System.out.println("CLL is empty!");
            return;
        }
        
        Node p = head;
        do{
            System.out.print(p.data);
            p = p.next;
            if(p!=head){
                System.out.print("<->");
            }
        }while(p!=head);
        System.out.println();
    }
    
    // Overloading
    public static void display(Node head){
        if(head == null){
            System.out.println("CLL is empty!");
            return;
        }
        
        Node p = head;
        do{
            System.out.print(p.data);
            p = p.next;
            if(p!=head){
                System.out.print("<->");
            }
        }while(p!=head);
        System.out.println();
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public Node addLongInt(Node head){
        Node a = this.head.prev;
        Node b = head.prev;
        
        DoublyCircularLinkedList result = new DoublyCircularLinkedList();
        
        int carry=0;
        int sum=0;
        
        do{
            sum = a.data + b.data + carry;
            carry = sum/10;
            sum %= 10;
            result.insert(sum);
            
            a = a.prev;
            b = b.prev;
        }while(a!=this.head.prev && b!=head.prev);
        
        while(a!=this.head.prev){
            sum = a.data + carry;
            carry = sum/10;
            sum %= 10;
            result.insert(sum);
            
            a = a.prev;
        }
        
        while(b!=head.prev){
            sum = b.data + carry;
            carry = sum/10;
            sum %= 10;
            result.insert(sum);
            
            b = b.prev;
        }
        
        return result.getHead();
    }
}
