package l2q2;

import MyStack.*;

public class L2Q2 {
    
    public static String decToBin(int n) throws Exception{
        DynamicStack s1 = new DynamicStack();
        
        while(n>0){
            s1.push(n%2);
            n/=2;
        }
        
        String result="";
        while(!s1.isEmpty()){
            result += s1.pop();
        }
        
        return result;
    }
    
    public static void main(String[] args) throws Exception{
        System.out.println(decToBin(24));
    }
    
}
