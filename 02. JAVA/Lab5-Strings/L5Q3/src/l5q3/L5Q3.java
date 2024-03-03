package l5q3;

import java.util.*;

public class L5Q3 {
    
    public static String removeOccr(String str, String substr){
        String res = str.replace(substr,"");
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(removeOccr("Ryan Gosling is literally me","li"));
    }
    
}
