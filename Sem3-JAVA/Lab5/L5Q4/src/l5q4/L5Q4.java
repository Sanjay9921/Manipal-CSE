package l5q4;

import java.util.*;

public class L5Q4 {

    public static String removeOccr(String str, String substr){
        String res = str.replace(substr,"");
        return res;
    }
    
    public static void main(String[] args) {
        String str = "Ryan Gosling is literally me";
        String substr = "li";
        
        String res = removeOccr(str, substr);
        int count = (str.length()-res.length())/substr.length();
        System.out.println("Occurences count: " + count);
    }
    
}
