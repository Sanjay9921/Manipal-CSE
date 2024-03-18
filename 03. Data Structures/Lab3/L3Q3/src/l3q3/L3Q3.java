package l3q3;

import java.util.Stack;

public class L3Q3 {
    
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
    
    public static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(char c : infix.toCharArray()){
            // 1. Append alphabets and digits to postfix string
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                postfix.append(c);
            }
            // 2. Brackets
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                // pop the last '('
                // Discard both parenthesis
                stack.pop(); 
            }
            // 3. Operator
            // Pop the operator if the precedence of current op <= tos op
            else{
                while(
                        !stack.isEmpty() && 
                        (precedence(c) <= precedence(stack.peek())) &&
                        associativity(c) == 'L'
                ){
                    postfix.append(stack.pop());
                }
                
                // Push the current operator
                stack.push(c);
            }
        }
        
        // 4. Pop the remaining characters to the postfix string
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    public static void main(String[] args) {
        String postfix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(postfix)); // abcd^e-fgh*+^*+i-
    }
}
