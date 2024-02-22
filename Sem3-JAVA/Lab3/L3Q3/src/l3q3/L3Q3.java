package l3q3;

import java.util.*;

class Time{
    int h;
    int m;
    int s;
    
    public Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
    @Override
    public String toString(){
        return this.h + " h : " + this.m + " m : " + this.s + " s";
    }
    
    public Time add(Time t2){
        Time result = new Time(this.h, this.m, this.s);
        result.s += t2.s;
        result.m += (result.s/60) + t2.m;
        result.s %= 60;
        result.h += (result.m/60) + t2.h;
        result.m %= 60;
        
        return result;
    }
    
    public Time subtract(Time t2){
        Time result = new Time(this.h, this.m, this.s);
        
        result.s -= t2.s;
        result.m += (result.s<0 ? -1 : 0) - t2.m;
        result.s += (result.s<0 ? 60 : 0);
        
        result.h += (result.m<0 ? -1 : 0) - t2.h;
        result.m += (result.m<0 ? 60 : 0);
        
        
        return result;
    }
    
    public void compare(Time t2){
        int t1Seconds = this.h*3600 + this.m*60 + this.s;
        int t2Seconds = t2.h*3600 + t2.m*60 + t2.s;
        
        if(t1Seconds > t2Seconds){
            System.out.println("T1 > T2");
        }
        else if(t1Seconds < t2Seconds){
            System.out.println("T1 < T2");
        }
        else{
            System.out.println("T1 == T2");
        }
    }
    
}

public class L3Q3 {
    public static void main(String[] args) {
        Time t1 = new Time(1,30,45);
        System.out.println("T1:= " + t1.toString());
        
        Time t2 = new Time(3,20,30);
        System.out.println("T2:= " + t2.toString());
        
        Time t3 = t1.add(t2);
        System.out.println("T3:= " + t3.toString());
        
        Time t4 = t2.subtract(t1);
        System.out.println("T4:= " + t4.toString());
        
        t1.compare(t2);
    }
    
}
