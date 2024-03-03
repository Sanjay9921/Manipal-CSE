package MyStack;

public interface Stack{
    public void push(int key) throws StackOverFlow;
    
    public int pop() throws StackUnderFlow;
    
    public void display();
}
