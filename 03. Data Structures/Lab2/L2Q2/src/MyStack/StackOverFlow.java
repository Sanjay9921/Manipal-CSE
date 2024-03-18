package MyStack;

public class StackOverFlow extends Exception{
    public StackOverFlow(){
        System.out.println("The stack is full!");
    }
    
    public StackOverFlow(String errMsg){
        System.out.println(errMsg);
    }
}
