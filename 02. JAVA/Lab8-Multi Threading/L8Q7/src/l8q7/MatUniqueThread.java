package l8q7;

import java.util.*; // Hash Map


public class MatUniqueThread implements Runnable{
    Thread t;
    Matrix mat;
    boolean unique;
    Map<Integer, Integer> hmap;
    
    MatUniqueThread(Matrix mat){
        t = new Thread(this);
        this.mat = mat;
        unique=true;
        hmap = new HashMap<>();
    }
    
    @Override
    public void run() {
        int n = mat.n;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(hmap.containsKey(mat.matrix[i][j])){
                    int currValue = hmap.get(mat.matrix[i][j]);
                    hmap.put(mat.matrix[i][j], 1 + currValue);
                }
                else{
                    hmap.put(mat.matrix[i][j], 1);
                }
            }
        }
  
        for(Map.Entry<Integer, Integer> e : hmap.entrySet()){
            if(e.getValue()!=1){
                unique = false;
                break;
            }
        } 
    }

    public boolean isUnique() {
        return unique;
    }
}
