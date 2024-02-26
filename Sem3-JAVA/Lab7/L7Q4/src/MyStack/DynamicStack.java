package MyStack;

public class DynamicStack implements Stack{
    
    int tos;
    int size;
    int[] stack;
    
    public DynamicStack(){
        tos=-1;
        this.size = 100;
        stack = new int[size];
    }
    
    @Override
    public void push(int key){
        if(tos==size){
            int[] t = new int[this.size];
            for(int i=0;i<this.size;i++){
                t[i] = stack[i];
            }
            
            stack = new int[(this.size*2)];
            for(int i=0;i<this.size;i++){
                stack[i] = t[i];
            }
            
            this.size*=2;
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
        for(int i=0;i<=tos;i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }
    
}