package l1q2;

import java.util.*;

public class L1Q2 {
    
    public static void main(String[] args) {
        
        int a,b,c;
        System.out.println("Quadratic Eq: ax2 + bx + c, enter a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int D = (int)(Math.pow(b,2) - 4*a*c);
        double r1,r2;
        
        switch(D){
            case 0:
                r1 = (-b)/(2*a);
                System.out.println("The roots are identitical: " + r1 + " and " + r1);
                break;
                
            default:
                if(D>0){
                    r1 = (-b + Math.sqrt(D))/(2*a);
                    r2 = (-b - Math.sqrt(D))/(2*a);
                    System.out.println("The roots are: " + r1 + " and " + r2);
                    
                }
                else{
                    System.out.println("The roots are not real.");
                }
                
                break;
        }
    }
    
}
