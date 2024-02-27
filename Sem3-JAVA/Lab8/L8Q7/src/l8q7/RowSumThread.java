package l8q7;

public class RowSumThread implements Runnable{
    Thread t;
    Matrix mat;
    int[] rowSum;
    
    RowSumThread(Matrix mat){
        t = new Thread(this);
        this.mat = mat;
        rowSum = new int[mat.n];
    }
    
    @Override
    public void run() {
        int n = mat.n;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowSum[i] += this.mat.matrix[i][j];
            }
        }
    }

    public int[] getRowSum() {
        return rowSum;
    }
}
