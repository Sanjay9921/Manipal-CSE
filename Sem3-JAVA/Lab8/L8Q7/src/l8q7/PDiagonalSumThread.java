package l8q7;

public class PDiagonalSumThread implements Runnable{
    Thread t;
    Matrix mat;
    int pSum;
    
    PDiagonalSumThread(Matrix mat){
        t = new Thread(this);
        this.mat = mat;
        pSum = 0;
    }
    
    @Override
    public void run() {
        int n = mat.n;
        
        for(int i=0;i<n;i++){
            pSum += mat.matrix[i][i];
        }
    }

    public int getPSum() {
        return pSum;
    }
}
