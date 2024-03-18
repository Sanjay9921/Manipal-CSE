package l2q3;

import MyStack.*;

public class L2Q3 {

    public static boolean isPalindrome(String str) throws Exception{
        FixedStack s1 = new FixedStack(str.length());
        for(int i=0;i<str.length();i++){
            s1.push(str.charAt(i));
        }
        
        for(int i=0;i<str.length()/2;i++){
            char c = (char)s1.pop();
            if(c!=str.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) throws Exception{
        System.out.println(isPalindrome("MaaM"));
        System.out.println(isPalindrome("MalayalaM"));
        System.out.println(isPalindrome("MaaN"));
    }
    
}
