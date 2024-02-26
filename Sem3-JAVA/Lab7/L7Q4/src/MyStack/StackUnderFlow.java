package MyStack;

public class StackUnderFlow extends Exception{
    public StackUnderFlow(){
        System.out.println("Stack is empty. Please add values to the stack.");
    }
    
    public StackUnderFlow(String errorMsg){
        super(errorMsg);
    }
}
