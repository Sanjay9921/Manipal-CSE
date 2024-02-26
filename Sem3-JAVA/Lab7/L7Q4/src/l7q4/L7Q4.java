package l7q4;

import MyStack.*;
import MyStack.FixedStack.*;
import MyStack.DynamicStack.*;


public class L7Q4 {
    public static void main(String[] args) throws Exception{
        FixedStack stack1 = new FixedStack(10); // 10 element size
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.display();
        
        DynamicStack stack2 = new DynamicStack();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.display();
    }
    
}
