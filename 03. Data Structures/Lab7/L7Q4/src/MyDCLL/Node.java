package MyDCLL;

public class Node {
    public int data;
    public Node prev;
    public Node next;
    
    public Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
}
