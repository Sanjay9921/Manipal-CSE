package l6q6;

import com.course.buildings.*;

public class L6Q6 {
    public static void main(String[] args) {
        Building b1 = new Building();
        House h1 = new House();
        School s1 = new School();
        
        b1.setSqFootage(5000.0f);
        b1.setStories(10);
        
        System.out.println(b1.getSqFootage());
        System.out.println(h1.getSqFootage());
        
    }
    
}
