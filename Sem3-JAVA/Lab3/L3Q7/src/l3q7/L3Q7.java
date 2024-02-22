package l3q7;

import java.util.Random;

class Die{
    int sideUp;
    Random random;
    
    public Die(){
        random = new Random();
        this.sideUp = random.nextInt(5)+1; // min:= 1, max:= 6
    }
    
    public int getSideUp(){
        return this.sideUp;
    }
    
    public void roll(){
        this.sideUp = random.nextInt(6)+1; // min:= 1, required max:= 6 , exclusive max = given as 7 to include 6
    }
}

public class L3Q7 {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        
        d1.roll();
        d2.roll();
        
        int sum = d1.getSideUp() + d2.getSideUp();
        System.out.println("You got: " + sum);
    }
    
}
