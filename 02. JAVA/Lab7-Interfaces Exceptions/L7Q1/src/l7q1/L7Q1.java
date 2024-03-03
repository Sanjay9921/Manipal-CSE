package l7q1;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class A implements Printable, Showable{
    public void print(){
        System.out.println("Ryan");
    }

    public void show(){
        System.out.println("Gosling");
    }
}

public class L7Q1 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.show();
    }
}

/*
// Also works
public class L7Q1 implements Printable, Showable{
    public void print(){
        System.out.println("Ryan");
    }

    public void show(){
        System.out.println("Gosling");
    }
    public static void main(String[] args) {
        L7Q1 a = new L7Q1();
        a.print();
        a.show();
    }
}
*/
