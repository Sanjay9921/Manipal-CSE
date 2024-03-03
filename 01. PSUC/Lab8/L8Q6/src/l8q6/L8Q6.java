package l8q6;

public class L8Q6 {

    public static int cornerSum(int[][] A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        
        int m = A.length;
        int n = A[0].length;
        
        return A[0][0] + A[0][n-1] + A[m-1][0] + A[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println(cornerSum(A));   
                    
    }
}
