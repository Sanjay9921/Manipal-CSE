package l3q1;

import java.util.*;

class Box{
    
    // instance variables
    double width;
    double height;
    double depth;
    
    // methods
    public void setDim(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double volume(){
        return this.width * this.height * this.depth;
    }
}

public class L3Q1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDim(10, 20, 15);
        double v1 = b1.volume();
        
        Box b2 = new Box();
        b2.setDim(3, 6, 9);
        double v2 = b2.volume();
        
        System.out.println("Volume1:= " + v1);
        System.out.println("Volume2:= " + v2);
    }
    
}
