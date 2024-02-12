package l8q4;

public class L8Q4 {

    public static void bubbleSort(int[] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-i-1;j++){
                if(A[j+1] < A[j]){
                    int t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] A = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort(A);
        
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
}
