package l9q4;

import java.util.*;

public class L9Q4 {

    private static double sum(List<? extends Number> list){
        double sum = 0.0;
        for(Number i : list){
            sum += i.doubleValue();
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        
        // Upper bound int list
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        System.out.println("Total sum:= " + sum(l1));
        
        List<Double> l2 = Arrays.asList(1.2,2.3,3.4,4.5);
        System.out.println("Total sum:= " + sum(l2));
    }
    
}
