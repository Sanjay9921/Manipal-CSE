package MySLL;

public class StackOverflow extends Exception{
    public StackOverflow(){
        System.out.println("Stack Overflow!");
    }
    
    public StackOverflow(String errMsg){
        super(errMsg);
    }
}
