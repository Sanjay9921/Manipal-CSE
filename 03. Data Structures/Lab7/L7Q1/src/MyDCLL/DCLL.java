// Doubly Circular Linked List

package MyDCLL;

public class DCLL {
    Node head;
    
    public DCLL(){
        head = new Node(0,Integer.MIN_VALUE); // dummy header with max exponent
        head.next = head;
        head.prev = head;
    }
    
    public void insert(int coef, int exp){
        Node newNode = new Node(coef, exp);
        
        Node curr = head.next;
        
        while(curr!=head){
            if(curr.exp < exp){
                break;
            }
            
            curr = curr.next;
        }
        
        newNode.next = curr;
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        curr.prev = newNode;
    }
    
    public void display(){
        Node p = head.prev;
        while(p!=head){
            System.out.print(p.coef + "x^" + p.exp);
            p = p.prev;
            if(p!=head){
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    
    public Node getHead(){
        return this.head;
    }
}
