package l6q4;

import myPackages.p1.Max;

public class L6Q4 {
    public static void main(String[] args) {
        System.out.println("Method Overloading Example: ");
        Max m = new Max();
        int res1 = m.max(10, 14, 12);
        float res2 = m.max(10.0f, 14.0f, 12.0f);
        int res3 = m.max(new int[]{10, 14, 12});
        int res4 = m.max(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        
        System.out.println("Res1: " + res1);
        System.out.println("Res2: " + res2);
        System.out.println("Res3: " + res3);
        System.out.println("Res4: " + res4);
    }
    
}
