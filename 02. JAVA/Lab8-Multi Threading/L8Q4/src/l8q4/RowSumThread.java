package l8q4;

public class RowSumThread implements Runnable{

    Thread t;
    int sum;
    int[] a;
    
    RowSumThread(int[] A){
        t = new Thread(this);
        sum = 0;
        a = A;
    }
    
    @Override
    public void run() {
        for(int i:a){
            sum += i;
        }
    }

    public int getRowSum() {
        return sum;
    }
}
