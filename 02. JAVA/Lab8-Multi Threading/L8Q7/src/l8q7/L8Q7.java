package l8q7;

public class L8Q7 {
    public static void main(String[] args) {
        
        /* Magic Square
        2   7   6
        9   5   1
        4   3   8
        */
        
        int n = 3;
        
        Matrix mat = new Matrix(n); // 3 rows x 3 columns
        mat.input();
        mat.display();
        
        int nThreads = 5;
        
        Thread t[] = new Thread[nThreads];
        
        RowSumThread t1 = new RowSumThread(mat);
        ColSumThread t2 = new ColSumThread(mat);
        PDiagonalSumThread t3 = new PDiagonalSumThread(mat);
        SDiagonalSumThread t4 = new SDiagonalSumThread(mat);
        MatUniqueThread t5 = new MatUniqueThread(mat);
        
        t[0] = new Thread(t1);
        t[1] = new Thread(t2);
        t[2] = new Thread(t3);
        t[3] = new Thread(t4);
        t[4] = new Thread(t5);
        

        for(int i=0;i<nThreads;i++){
            t[i].start();
        }
        
        // Required values
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int pSum=0;
        int sSum=0;
        boolean unique=true;
        boolean flag = true;
        
        try{
            for(int i=0;i<nThreads;i++){
                t[i].join();
                switch(i){
                    case 0:
                        rowSum = t1.getRowSum();
                        System.out.println("Inside thread 1");
                        break;
                    case 1:
                        colSum = t2.getColSum();
                        System.out.println("Inside thread 2");
                        break;
                    case 2:
                        pSum = t3.getPSum();
                        System.out.println("Inside thread 3");
                        break;
                    case 3:
                        sSum = t4.getSSum();
                        System.out.println("Inside thread 4");
                        break;
                    case 4:
                        unique = t5.isUnique();
                        System.out.println("Inside thread 5");
                        break;
                }
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted...");
        }
        
        if(unique==true){
            for(int i=0;i<n;i++){
                if(rowSum[i]==colSum[i] && rowSum[i]==pSum && rowSum[i]==sSum){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
        }
        else{
            flag = false;
        }
        
        if(flag){
            System.out.println("Magic Square!");
        }
        else{
            System.out.println("Not a Magic Square :(");
        }
    }
    
}
