package MySLL;

public class StackUnderflow extends Exception{
    public StackUnderflow(){
        System.out.println("Stack Underflow!");
    }
    
    public StackUnderflow(String errMsg){
        super(errMsg);
    }
}
