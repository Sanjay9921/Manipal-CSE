package l1q4;

public class L1Q4 {

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static String copyString(String str1, String str2, int i){
        if(i==str1.length()){
            return str2;
        }
        
        str2 += str1.charAt(i);
        
        return copyString(str1, str2, i+1);
        
    }
    
    public static boolean isPalindrome(String str, int l, int r){
        if(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            
            return isPalindrome(str,l+1,r-1);
        }
        
        return true;
    }
    
    public static String firstCapital(String str, int i){
        if(i<str.length()){
            char c = str.charAt(i);
            if (c>=65 && c<=90){
                return String.valueOf(c);
            }
            
            return firstCapital(str,i+1);
        }
        
        return "No capital found!";
    }
    
    public static String mirrorText(String str, int i){
        if(i<str.length()){
            char c = str.charAt(i);
            return mirrorText(str,i+1) + String.valueOf(c);
        }
        
        return "";
    }
    
    public static void main(String[] args) {
        // 1. Fibonacci Series
        for(int i=0;i<5;i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("");
        
        // 2. Copying String
        String str1 = "Ryan Gosling";
        String str2 = copyString(str1, "", 0);
        System.out.println(str2);
        
        // 3. Palindrome
        str1 = "malayalam";
        str2 = "ryan gosling";
        System.out.println(isPalindrome(str1,0,str1.length()-1));
        System.out.println(isPalindrome(str2,0,str2.length()-1));
        
        // 4. First Capital
        str1 = "i am Literally Ryan Gosling";
        System.out.println(firstCapital(str1,0));
        
        // 5. Mirror Text
        str1 = "i am Literally Ryan Gosling";
        System.out.println(mirrorText(str1,0));
    }
    
}
