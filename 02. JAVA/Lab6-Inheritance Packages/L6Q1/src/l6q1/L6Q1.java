package l6q1;

class Shape{
    private double width;
    private double height;
    
    public Shape(){}
    
    public Shape(double w, double h){
        width = w;
        height = h;
    }
    
    // ALT + Insert shortcut to generate getters and setters

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Width=" + width + ", Height=" + height;
    }  
}

class Triangle extends Shape{
    public Triangle(){}
    
    public Triangle(double h, double w){
        super(h,w);
        // setHeight(h);
        // setWidth(w);
    }
    
    public double area(){
        return 0.5 * getHeight() * getWidth();
    }
}
public class L6Q1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 12);
        System.out.println("Area of Triangle: " + t1.area());
    }
    
}
