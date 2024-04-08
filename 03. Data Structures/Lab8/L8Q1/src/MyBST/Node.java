package MyBST;

public class Node {
    private int data;
    Node left; // left child
    Node right; // right child
    
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
    
    public int getData(){
        return data;
    }
    
    public void setData(int data){
        this.data = data;
    }
}
