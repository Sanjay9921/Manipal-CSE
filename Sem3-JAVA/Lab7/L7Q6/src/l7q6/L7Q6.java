package l7q6;

public class L7Q6 {

    public static void main(String[] args) {
        Student s1 = new Student();
        try{
            s1.input();
        }
        catch(SeatsFilledException e){
            System.out.println(e.toString());
        }
        
        s1.display();
    }
    
}
