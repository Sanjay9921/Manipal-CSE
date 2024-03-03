package MyStack;

public class FixedStack implements Stack{
    
    int tos;
    int size;
    int[] stack;
    
    public FixedStack(int size){
        tos=-1;
        this.size = size;
        stack = new int[size];
    }
    
    @Override
    public void push(int key) throws StackOverFlow{
        if(tos==size){
            throw new StackOverFlow();
        }
        else{
            stack[++this.tos] = key;
        }
    }

    @Override
    public int pop() throws StackUnderFlow{
        if(tos==-1){
            throw new StackUnderFlow();
        }
        else{
            int x = stack[this.tos--];
            return x;
        }
    }

    @Override
    public void display() {
        for(int x:stack){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
}
