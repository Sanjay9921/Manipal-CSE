package MyDLL;

public class SparseMatrix {
    int m; // total rows
    int n; // total columns
    Node head;
    
    public SparseMatrix(int m, int n){
        this.m = m;
        this.n = n;
        head = null;
    }
    
    public void insert(int row, int col, int data){
        Node newNode = new Node(row, col, data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        Node prevRow = null;
        Node prevCol = null;

        // Find the appropriate position to insert the new node
        while (current != null && (current.row < row || (current.row == row && current.col < col))) {
            prevRow = current;
            current = current.nextRow;
        }

        current = head;

        while (current != null && (current.col < col || (current.col == col && current.row < row))) {
            prevCol = current;
            current = current.nextCol;
        }

        // Check if the node already exists at the given position
        if (current != null && current.row == row && current.col == col) {
            current.data = data;
            return;
        }

        // Insert the new node into rows
        if (prevRow == null) {
            newNode.nextRow = head;
            head.prevRow = newNode;
            head = newNode;
        } else {
            newNode.nextRow = prevRow.nextRow;
            if (prevRow.nextRow != null)
                prevRow.nextRow.prevRow = newNode;
            prevRow.nextRow = newNode;
            newNode.prevRow = prevRow;
        }

        // Insert the new node into columns
        if (prevCol == null) {
            newNode.nextCol = head;
            head.prevCol = newNode;
            head = newNode;
        } else {
            newNode.nextCol = prevCol.nextCol;
            if (prevCol.nextCol != null)
                prevCol.nextCol.prevCol = newNode;
            prevCol.nextCol = newNode;
            newNode.prevCol = prevCol;
        }
    }
    
    public void display(){
        Node pRow = head;
        for(int i=0;i<m;i++){
            Node pCol = pRow;
            for(int j=0;j<n;j++){
                
                // If element exists
                if(pCol != null && pCol.row == i && pCol.col == j){
                    System.out.print(pCol.data + " ");
                    pCol = pCol.nextCol;
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
            
            if(pRow!=null && pRow.row == i){
                pRow = pRow.nextRow;
            }
        }
    }
}
