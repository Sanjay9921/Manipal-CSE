package l9q6;

public class L9Q6{

    public static <T> void printArray(T[] arr){
        for(T i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        // Use Wrapper classes instead of primitive data types
        Integer[] a1 = {1,2,3,4,5};
        Float[] a2 = {1.0f,2.0f,3.0f,4.0f,5.0f};
        Double[] a3 = {1.2, 3.4, 5.6, 7.8};
        String[] a4 = {"I", "am", "Ryan","literally", "me", "Gosling"};
        
        printArray(a1);
        printArray(a2);
        printArray(a3);
        printArray(a4);
    }
    
}
