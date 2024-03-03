package l7q6;

public class SeatsFilledException extends Exception{
    public SeatsFilledException(){
        System.out.println("All seats are filled!");
    }
    
    public SeatsFilledException(String errMsg){
        super(errMsg);
    }
}
