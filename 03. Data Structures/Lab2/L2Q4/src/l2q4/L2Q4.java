package l2q4;

import MyStack.*;

public class L2Q4 {
    public static void task(int[] arr, int k) throws Exception{
        int n = arr.length;
        FixedStack s1 = new FixedStack(n);
        int i=0;
        s1.push(arr[i++]);
        while(k>0 && i<n){
            while(!s1.isEmpty() && arr[i]>s1.peek()){
                int x = s1.pop();
                k--;
            }
            s1.push(arr[i++]);
        }
        
        while(i<n){
            s1.push(arr[i++]);
        }
        
        s1.display();
    }
    public static void main(String[] args) throws Exception{
        int[] arr = {20,10,25,30,40};
        int k = 2;
        task(arr, k);
    }
    
}
