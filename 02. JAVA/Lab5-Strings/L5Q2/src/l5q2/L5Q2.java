package l5q2;

import java.util.*;

public class L5Q2 {
    
    public static String strWithCommas(String str){
        String result = "";
        int counter=0;
        for(int i=0;i<str.length();i++){
            counter++;
            if(counter==3){
                counter=0;
                result += ",";
            }
            
            result += str.charAt(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String str = "";
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        String res = strWithCommas(str);
        System.out.println("Western Comma System: " + res);
    }
    
}
