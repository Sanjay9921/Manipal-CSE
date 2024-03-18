package l2q5;

// Uses inbuilt Stack function
import java.util.Stack;

public class L2Q5 {

    public static void NGE(int[] arr) throws Exception{
        int n = arr.length;
        
        Stack<Integer> s1 = new Stack<>();
        
        s1.push(arr[0]);
        
        for(int i=1;i<n;i++){
            int next = arr[i];
            
            while(!s1.isEmpty() && s1.peek() < next){
                System.out.println(s1.pop() + " -> " + next); // first greater element from the right side
            }
            
            s1.push(next);
        }
        
        while(!s1.isEmpty()){
            System.out.println(s1.pop() + " -> -1");
        }
        
    }
    public static void main(String[] args) throws Exception{
        NGE(new int[]{13, 7, 6, 12});
    }
    
}
