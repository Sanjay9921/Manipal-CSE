package MySLL;

public class Stack {
    private Node tos;
    
    public Stack(){
        this.tos = null; // similar to tos=-1
    }
    
    public boolean isEmpty(){
        return tos == null;
    }
    
    // Dynamic Stack Sizing
    // No need of StackOverflow exception
    public void push(int x){
        Node t = new Node(x);
        if(isEmpty()){
            tos = t;
        }
        else{
            t.next = tos; // LIFO
            tos = t;
        }
    }
    
    public int pop() throws StackUnderflow{
        if(isEmpty()){
            throw new StackUnderflow();
        }
        
        int x = tos.data;
        tos = tos.next;
        return x;
    }
    
    public int peek() throws StackUnderflow{
        if(isEmpty()){
            throw new StackUnderflow();
        }
        
        return tos.data;
    }
    
    public void display() throws StackUnderflow{
        if(isEmpty()){
            throw new StackUnderflow();
        }
        
        Node p = tos;
        while(p!=null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        
        System.out.println();
    }
}
