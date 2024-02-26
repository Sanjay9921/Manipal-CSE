package myPackages.p1;

public class Max {
    public int max(int a, int b, int c){
        return (a>b ? (a>c?a:c) : (b>c?b:c));
    }
    
    public float max(float a, float b, float c){
        return (a>b ? (a>c?a:c) : (b>c?b:c));
    }
    
    public int max(int[] a){
        int result = a[0];
        for(int x:a){
            result = (result < x ? x : result);
        }
        return result;
    }
    
    public int max(int[][] mat){
        int result = mat[0][0];
        for(int[] i:mat){
            for(int j : i){
                result = (result < j ? j : result);
            }
        }
        return result;
    }
}
