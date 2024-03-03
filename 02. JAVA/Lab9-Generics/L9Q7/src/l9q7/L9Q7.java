package l9q7;

public class L9Q7 {

    public static <T extends Comparable<? super T>> T max(T a, T b, T c){
        T d = ((a.compareTo(b) >= 0 ) ? a : b);
        T e = ((c.compareTo(d) >= 0 ) ? c : d);
        return e;
    }
    
    public static void main(String[] args) {
        System.out.println(max(1,2,3));
        System.out.println(max(1.0,2.0,3.0));
        System.out.println(max("Ryan","Literally Me","Gosling"));
    }
    
}
