package l7q2;

public class L7Q2 {
    public static void main(String[] args) {
        int[] arr = new int[2]; // available indices:= 0,1
        
        try{
            System.out.println("Try accessing this: " + arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am literally Ryan Gosling. Which means I will always be executed in finally block.");
        }
    }
    
}
