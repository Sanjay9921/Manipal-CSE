package l3q5;

class Stack{
    int tos; // top of the stack
    int n;
    int arr[]; // stores stack elements
    
    public Stack(int n){
        tos = -1;
        this.n = n;
        arr = new int[n];
    }
    
    public void push(int x){
        if(tos==this.n-1){
            System.out.println("Stack Overflow");
        }
        else{
            arr[++tos] = x;
        }
    }
    
    public int pop(){
        int x = Integer.MIN_VALUE;
        
        if(tos==-1){
            System.out.println("Stack Underflow");
        }
        else{
            x = arr[tos--];
        }
        
        return x; // returns Integer.MIN_VALUE if there are no elements
    }
    
    public void display(){
        if(tos==-1){
            System.out.println("Stack Underflow");
        }
        else{
            // tos is the top of the stack, there might be empty elements if this.n is used
            for(int i=0;i<=tos;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
    }
}

public class L3Q5 {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        System.out.println("Popped Element:= " + s1.pop());
        s1.display();
    }
    
}
