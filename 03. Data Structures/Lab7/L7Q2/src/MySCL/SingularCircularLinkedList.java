package MySCL;

public class SingularCircularLinkedList {
    Node head;
    
    public void insert(int x){
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            head.next = head;
        }
        else{
            Node p = head;
            while(p.next != head){
                p = p.next;
            }
            
            p.next = newNode;
            newNode.next = head;
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
                System.out.print("->");
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
                System.out.print("->");
            }
        }while(p!=head);
        System.out.println();
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public Node intersection(Node head){
        Node a = this.head;
        Node b = head;
        
        SingularCircularLinkedList result = new SingularCircularLinkedList();
        
        do{
            if(a.data == b.data){
                result.insert(a.data);
                a = a.next;
                b = b.next;
            }
            else if(a.data < b.data){
                a = a.next;
            }
            else{
                b = b.next;
            }
        }while(a!=this.head && b!=head);
        
        return result.getHead();
    }
    
    public Node union(Node head){
        Node a = this.head;
        Node b = head;
        
        SingularCircularLinkedList result = new SingularCircularLinkedList();
        
        do{
            if(a.data == b.data){
                result.insert(a.data);
                a = a.next;
                b = b.next;
            }
            else if(a.data < b.data){
                result.insert(a.data);
                a = a.next;
            }
            else{
                result.insert(b.data);
                b = b.next;
            }
        }while(a!= this.head && b!=head);
        
        while(a!=this.head){
            result.insert(a.data);
            a = a.next;
        }
        
        while(b!=head){
            result.insert(b.data);
            b = b.next;
        }
        
        return result.getHead();
    }
}
