package l6q5;

abstract class Figure{
    int dim1;
    int dim2;
    
    abstract double area(int dim1, int dim2);
    
    static void print1(){
        System.out.println("Static Figure");
    }
    
    void print2(){
        System.out.println("Figure");
    }
}

class Triangle extends Figure{
    @Override
    double area(int dim1, int dim2){
        return 0.5 * dim1 * dim2;
    }
    
    // @Override
    // Static methods cannot be overriden
    static void print1(){
        System.out.println("Static Triangle");
    }
    
    @Override
    void print2(){
        System.out.println("Triangle");
    }   
}

class Square extends Figure{
    @Override
    double area(int dim1, int dim2){
        return dim1 * dim2;
    }
    
    // @Override
    // Static methods cannot be overriden
    static void print1(){
        System.out.println("Static Square");
    }
    
    @Override
    void print2(){
        System.out.println("Square");
    }
}

class Rectangle extends Figure{
    @Override
    double area(int dim1, int dim2){
        return dim1 * dim2;
    }
    
    // @Override
    // Static methods cannot be overriden
    static void print1(){
        System.out.println("Static Rectangle");
    }
    
    @Override
    void print2(){
        System.out.println("Rectangle");
    }
}


public class L6Q5 {
    public static void main(String[] args) {
        int dim1=10;
        int dim2=12;
        
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        Figure f1;
        
        // Dynamic Method Dispatch
        // ParentClass obj = new ChildClass //Upcasting
        f1 = t1;
        t1.area(dim1, dim2);
        t1.print1(); // Static Triangle
        t1.print2(); // Triangle
        f1.print1(); // Static Figure
        f1.print2(); // Static Triangle // Not Static Figure !
    }
    
}
