package l9q1;

class Gen<T>{
    T object;
    
    Gen(T object){
        this.object = object;
    }
    
    public T getObject(){
        return this.object;
    }
    
    public void display(){
        System.out.println("Type of T: " + object.getClass().getName());
    }
}

public class L9Q1 {
    public static void main(String[] args) {
        Gen<Integer> iObj = new Gen<Integer>(100);
        iObj.display();
        
        int x = iObj.getObject();
        System.out.println("value:= " + x);
        System.out.println("");
        
        Gen<String> strObj = new Gen<String>("Generics Test");
        strObj.display();
        
        String str = strObj.getObject();
        System.out.println("value:= " + str);
    }
    
}
