package MyStack;

public class StackUnderFlow extends Exception{
    public StackUnderFlow(){
        System.out.println("The stack is empty!");
    }
    
    public StackUnderFlow(String errMsg){
        System.out.println(errMsg);
    }
}
