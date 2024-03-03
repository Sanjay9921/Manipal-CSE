package l8q7;

public class ColSumThread implements Runnable{
    Thread t;
    Matrix mat;
    int[] colSum;
    
    ColSumThread(Matrix mat){
        t = new Thread(this);
        this.mat = mat;
        colSum = new int[mat.n];
    }
    
    @Override
    public void run() {
        int n = mat.n;
        
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                colSum[i] += this.mat.matrix[i][j];
            }
        }
    }

    public int[] getColSum() {
        return colSum;
    }
}
