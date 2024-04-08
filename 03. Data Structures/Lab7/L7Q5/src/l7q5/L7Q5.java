package l7q5;

import MyDLL.*;

public class L7Q5 {
    public static void main(String[] args) {
        SparseMatrix spm = new SparseMatrix(3,3);
        spm.insert(2, 2, 10);
        spm.insert(1, 1, 5);
        spm.insert(0, 0, 2);
        spm.insert(1, 2, 8);
        
        spm.display();
    }
    
}
