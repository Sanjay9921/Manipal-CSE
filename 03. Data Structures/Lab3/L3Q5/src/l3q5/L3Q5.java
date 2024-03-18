package l3q5;

import java.util.Stack;

public class L3Q5 {
    
    // Prefix to Postfix Code
    // Operator check
    public static boolean isOperator(char c){
        return c=='^' || c=='+' || c=='-' || c=='*' || c=='/';
    }
    
    // Precedence of operators
    public static int precedence(char c){
        int prec = -1;
        
        switch(c){
            case '^':
                prec = 3; // highest
                break;
            case '/':
                prec = 2;
                break;
            case '*':
                prec = 2;
                break;
            case '-':
                prec = 1; // lowest
                break;
            case '+':
                prec = 1; // lowest
                break;
        }
        
        return prec;
    }
    
    // Associativity of operators
    public static char associativity(char c){
        if(c=='^'){
            return 'R'; // right
        }
        else{
            return 'L'; // left
        }
    }
    
    // Reversing the String
    public static String reverse(String s, int start, int end){
        char[] str = s.toCharArray();
        while(start<end){
            char c = str[start];
            str[start] = str[end];
            str[end] = c;
            start++;
            end--;
        }
        
        return String.valueOf(str);
    }
    
    public static String preToPost(String prefix){
        Stack<String> stack = new Stack<>();
        
        for(char c : prefix.toCharArray()){
            // 1. Append alphabets and digits to postfix string
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                stack.push(c + "");
            }
            // 2. Operator
            // Pop the operator if the precedence of !! current op < tos op !!
            // If it were only postfix conversion, we would use current op <= tos op
            else{
                if(isOperator(c)){
                    String op1 = stack.pop();
                    String op2 = stack.pop();
                    
                    String result = op1 + op2 + c;

                    // Push the current operator
                    stack.push(result);
                }
            }
        }
        
        return stack.pop();
    }
    
    public static String prefixToPostfix(String prefix){
        int l = prefix.length();
        // 1. Reverse the string
        String revPrefix = reverse(prefix,0,l-1);
        
        // 2. Rules
        String postfix = preToPost(revPrefix);
        
        return postfix;
    }
    
    public static void main(String[] args) {
        String prefix = "++x/*yzwu";
        String postfix = prefixToPostfix(prefix);
        System.out.println(postfix);
    }
    
}
