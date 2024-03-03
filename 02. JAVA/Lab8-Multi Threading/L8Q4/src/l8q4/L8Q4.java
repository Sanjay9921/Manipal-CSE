package l8q4;

public class L8Q4 {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        
        Matrix mat = new Matrix(m,n); // 3 rows x 2 columns
        mat.input();
        mat.display();
        
        Thread t[] = new Thread[m];
        RowSumThread rst[] = new RowSumThread[m];
        
        for(int i=0;i<m;i++){
            rst[i] = new RowSumThread(mat.getRow(i));
            t[i] = new Thread(rst[i]);
            t[i].start();
        }
        
        int finalSum=0;
        
        try{
            for(int i=0;i<m;i++){
                t[i].join();
                finalSum += rst[i].getRowSum();
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted...");
        }
        
        System.out.println("Sum of all elements in the matrix:= " + finalSum);
        
    }
    
}
