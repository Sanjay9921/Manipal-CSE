package MyDLL;

public class Node {
    public int row;
    public int col;
    public int data;
    
    Node nextRow, prevRow;
    Node nextCol, prevCol;
    
    public Node(int row, int col, int data){
        this.row = row;
        this.col = col;
        this.data = data;
        
        nextRow = prevRow = nextCol = prevCol = null;
    }
}
