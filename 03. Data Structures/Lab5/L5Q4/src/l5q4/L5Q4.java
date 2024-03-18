package l5q4;

import java.util.ArrayDeque;

public class L5Q4 {

    public static boolean isPalindrome(String str){
        ArrayDeque<Character> dq = new ArrayDeque<>();
        
        // remove all non alpha numeric characters using regex
        // convert all letters to lowercase
        // convert to character array
        char[] charArr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        
        for(char c : charArr){
            dq.addLast(c);
        }
        
        while(dq.size() > 1){
            char front = dq.removeFirst();
            char rear = dq.removeLast();
            
            if(front != rear){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        String[] strArr = {"Malayalam", "Ryan Gosling"};
        for(String s:strArr){
            boolean result = isPalindrome(s);
            System.out.println("Is " + s + " a palindrome? " + result);
        }
    }
    
}
