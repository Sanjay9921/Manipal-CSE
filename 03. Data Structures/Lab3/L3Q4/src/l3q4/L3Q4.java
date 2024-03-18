package l3q4;

import java.util.Stack;

public class L3Q4 {
    
    // Infix to Postfix Code
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
    
    public static String infixToPostfix(String infix1){
        String infix = "(" + infix1 + ")";
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
            // Pop the operator if the precedence of !! current op < tos op !!
            // If it were only postfix conversion, we would use current op <= tos op
            else{
                if(isOperator(c)){
                    while(
                            !stack.isEmpty() && 
                            (precedence(c) < precedence(stack.peek())) &&
                            associativity(c) == 'L'
                    ){
                        postfix.append(stack.pop());
                    }

                    // Push the current operator
                    stack.push(c);
                }
            }
        }
        
        // 4. Pop the remaining characters to the postfix string
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
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
    
    // Prefix Code
    public static String infixToPrefix(String infix){
        
        int l = infix.length();
        
        // 1. Reverse the infix
        String revInfix = reverse(infix,0,l-1);
        
        // Replace '(' with ')' and vice versa
        char[] charArr = revInfix.toCharArray();
        for(int i=0;i<l;i++){
            if(charArr[i]=='('){
                charArr[i] = ')';
            }
            else if(charArr[i]==')'){
                charArr[i] = '(';
            }
        }
        String newInfix = String.valueOf(charArr);
        
        // 2. Convert the reversed infix to postfix
        String postfix = infixToPostfix(newInfix);
        
        // 3. Reverse the string
        String prefix = reverse(postfix, 0, l-1);
        
        return prefix;
    }
    
    public static void main(String[] args) {
        String prefix = "x+y*z/w+u";
        System.out.println(infixToPrefix(prefix));
        System.out.println(infixToPostfix(prefix));
    }  
}
