package l8q3;

public class L8Q3 {
    public static void main(String[] args) {
        new TableThread(5);
        new TableThread(7);
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted...");
        }
    }
    
}
