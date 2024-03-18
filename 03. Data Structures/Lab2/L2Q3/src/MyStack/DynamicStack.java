package MyStack;

public class DynamicStack {
    int tos;
    int size;
    int[] stack;
    
    public DynamicStack(){
        tos=-1;
        size = 100;
        stack = new int[size];
    }
    
    public void push(int x){
        if(tos==size-1){
            int[] temp = new int[size*2];
            for(int i=0;i<size;i++){
                temp[i] = stack[i];
            }
            
            stack = temp;
            size*=2;
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
