package l9q2;

public class L9Q2 {

    public static <T> void exchange(T[] arr, int p1, int p2){
        T temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
    
    public static <T> void display(T[] arr){
        for(T i:arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {1.2, 3.4, 5.6, 7.8, 9.10};
        String[] strArr = {"I", "am", "Ryan", "literally", "me", "Gosling"};
        
        System.out.println("Intial: ");
        display(intArr);
        display(doubleArr);
        display(strArr);
        
        System.out.println("Swapping position 1 and 2: ");
        exchange(intArr, 1, 2);
        exchange(doubleArr, 1, 2);
        exchange(strArr, 1, 2);
        
        display(intArr);
        display(doubleArr);
        display(strArr);
    }
    
}
