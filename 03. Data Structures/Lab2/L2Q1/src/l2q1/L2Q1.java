package l2q1;

import MyStack.*;

public class L2Q1 {
    
    public static void checkExpression(String str) throws StackUnderFlow, StackOverFlow{
        DynamicStack s1 = new DynamicStack();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('){
                s1.push(1);
            }
            else if(c==')'){
                if(s1.peek()==1){
                    s1.pop();
                }
            }
        }
        
        if(s1.isEmpty()){
            System.out.println("The expression " + str + " is balanced!");
        }
        else{
            System.out.println("The expression " + str + " is NOT balanced!");
        }
    }
    
    public static void main(String[] args) throws Exception{
        String str1 = "(a+b)+(c*d*(a-b)";
        String str2 = "(a+b)+(c*d*(a-b))";
        
        // Test Case 1
        checkExpression(str1);
        
        // Test Case 2
        checkExpression(str2);
    }
    
}
