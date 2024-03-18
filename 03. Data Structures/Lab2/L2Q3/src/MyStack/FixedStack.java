package MyStack;

public class FixedStack {
    int tos;
    int size;
    int[] stack;
    
    public FixedStack(int n){
        tos=-1;
        size = n;
        stack = new int[size];
    }
    
    public void push(int x) throws StackOverFlow{
        if(tos==size-1){
            throw new StackOverFlow();
        }
        
        stack[++tos] = x;
    }
    
    public int pop() throws StackUnderFlow{
        if(tos==-1){
            throw new StackUnderFlow();
        }
        
        int x = stack[tos--];
        return x;
    }
    
    public int peek() throws StackUnderFlow{
        if(tos==-1){
            throw new StackUnderFlow();
        }
        
        return stack[tos];
    }
    
    public boolean isEmpty(){
        return tos==-1;
    }
    
    public void display() throws StackUnderFlow{
        if(tos==-1){
            throw new StackUnderFlow();
        }
        
        for(int x:stack){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
