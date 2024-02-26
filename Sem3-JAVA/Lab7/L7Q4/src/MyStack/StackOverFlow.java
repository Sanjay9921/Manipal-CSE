package MyStack;

public class StackOverFlow extends Exception{
    public StackOverFlow(){
        System.out.println("Stack is full. Please remove values from the stack.");
    }
    
    public StackOverFlow(String errorMsg){
        super(errorMsg);
    }
}
