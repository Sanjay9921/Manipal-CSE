package l8q3;

public class L8Q3 {

    public static int largestFrom(int[] A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        
        int result=A[0];
        for(int i=1;i<A.length;i++){
            result = (result < A[i] ? A[i] : result);
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(largestFrom(A));
    }
    
}
