package l3q6;

import java.util.*;

class ISBN{
    String code;
    int[] arr = new int[10];
    int sum=0;
    
    public void inputISBN(String code){
        if(code.length()==10){
            this.code = code;
            for(int i=0;i<10;i++){
                arr[i] = code.charAt(i)-48;
                this.sum += ((i+1) * arr[i]);
            }
        }
        else{
            System.out.println("The ISBN Code has to be 10 characters in length. Please try again...");
        }
    }
    
    public void checkISBN(){
        if(this.sum%11 == 0){
            System.out.println("Legal ISBN");
        }
        else{
            System.out.println("Illegal ISBN");
        }
    }
}

public class L3Q6 {
    public static void main(String[] args) {
        String code="";
        
        System.out.println("Enter the 10-digit ISBN Code..."); // Example: 1401601499
        Scanner sc = new Scanner(System.in);
        code = sc.next();
        
        ISBN c1 = new ISBN();
        c1.inputISBN(code);
        c1.checkISBN();
    }
    
}
