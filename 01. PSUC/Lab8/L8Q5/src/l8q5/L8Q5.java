package l8q5;

public class L8Q5 {

    public static boolean isPalin(int m){
        boolean flag=true;
        
        String str = String.valueOf(m);
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag=false;
                break;
            }
        }
        
        return flag;
    }
            
    public static void main(String[] args) {
        int n1 = 1001;
        int n2 = 1002;
        
        System.out.println(isPalin(n1));
        System.out.println(isPalin(n2));
    }
    
}
