package MyCLL;

public class Node {
    private int data;
    public Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public void setData(int x){
        this.data = x;
    }
    
    public int getData(){
        return this.data;
    }
}
