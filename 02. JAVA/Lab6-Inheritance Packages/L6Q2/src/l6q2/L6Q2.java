package l6q2;

import packDemo.*; // 1 // Packagename.*
import packDemo.PackageDemo; // 2 // Packagename.classname


public class L6Q2 {
    public static void main(String[] args) {
        PackageDemo pd = new PackageDemo();
        pd.msg();
        
        packDemo.PackageDemo pd2 = new packDemo.PackageDemo(); // 3 // Fully Qualified Name
        pd2.msg();
    }
    
}
