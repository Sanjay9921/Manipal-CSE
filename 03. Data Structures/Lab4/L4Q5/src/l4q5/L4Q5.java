// Lazy Evaluation Method
// Time Complexity:= O(1) ( Enqueue + Dequeue + Peek )
// Space Complexity:= O(N)

package l4q5;

// Lazy Evaluation
// strategy of deferring the evaluation or computation of an operation until it is actually needed.
// Queue using Two Stacks

import java.util.Stack;

class Queue{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    
    public Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void lazyEvaluation(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
    
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    
    // Use Stack 1 as input stack
    public void enqueue(int x){
        s1.push(x);
    }
    
    // use Stack 2 as output stack
    // Condition: you can push elements from s1 -> s2 but NOT vice-versa
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
        
        lazyEvaluation();
        
        return s2.pop();
    }
    
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
        
        lazyEvaluation();
        
        return s2.peek();
    }
}

public class L4Q5 {
    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.peek()); // 10
        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek()); // 20
    }
    
}
