package l8q7;

public class SDiagonalSumThread implements Runnable{
    Thread t;
    Matrix mat;
    int sSum;
    
    SDiagonalSumThread(Matrix mat){
        t = new Thread(this);
        this.mat = mat;
        sSum = 0;
    }
    
    @Override
    public void run() {
        int n = mat.n;
        
        for(int i=n-1;i>=0;i--){
            sSum += mat.matrix[i][i];
        }
    }

    public int getSSum() {
        return sSum;
    }
}
