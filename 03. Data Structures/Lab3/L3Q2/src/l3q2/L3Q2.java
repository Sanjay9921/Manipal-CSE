// Prefix Expression Evaluation using Stack
// Time Complexity:= O(N)
// Space Complexity:= O(1)

package l3q2;

import java.util.Stack;

public class L3Q2 {
    
    public static int evaluate(int a, int b, char op){
        int result = Integer.MIN_VALUE;
        
        // switch case is efficient than long if-else branching here
        switch(op){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            case '%':
                result = a%b;
                break;
        }
        
        return result;
    }

    public static int prefix(String str){
        Stack<Integer> stack = new Stack<>();
        
        for(int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            
            // 1. Skip spaces
            if(c==' '){
                continue;
            }
            // 2. Multiple digits check
            else if(Character.isDigit(c)){ 
                int result = 0;
                int shift=1;
                while(Character.isDigit(c)){
                    result += (int)(c - '0')*shift; // as we are moving from right to left
                    shift*=10;
                    c = str.charAt(--i);
                }
                i++; // reverse the iterator back so that the current non digit character is not lost
                stack.push(result);
            }
            // 3. Operator
            else{
                int a = stack.pop();
                int b = stack.pop();
                
                int result = evaluate(b,a,c);
                
                stack.push(result);
            }
        }
        
        return stack.pop();
    }
    
    public static void main(String[] args) {
        // Prefix Expression
        String str = "+ 9 * 12 6";
        System.out.println(prefix(str));
    }
    
}
