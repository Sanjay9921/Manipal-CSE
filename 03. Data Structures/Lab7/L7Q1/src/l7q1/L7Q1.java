package l7q1;

import MyDCLL.*; // custom Doubly circular linked list

public class L7Q1 {
    
    public static DCLL addPoly(DCLL list1, DCLL list2){
        DCLL result = new DCLL();
        
        // skip dummy header node
        Node a = list1.getHead().next;
        Node b = list2.getHead().next;
        
        while(a!=list1.getHead() && b!=list2.getHead()){
            if(a.exp == b.exp){
                int coef = a.coef + b.coef;
                result.insert(coef, a.exp);
                
                a = a.next;
                b = b.next;
            }
            else if(a.exp > b.exp){
                result.insert(a.coef, a.exp);
                a = a.next;
            }
            else{
                result.insert(b.coef, b.exp);
                b = b.next;
            }
        }
        
        while(a!=list1.getHead()){
            result.insert(a.coef, a.exp);
            a = a.next;
        }
        
        while(b!=list2.getHead()){
            result.insert(b.coef, b.exp);
            b = b.next;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        DCLL p1 = new DCLL();
        // 3x^2 + 2x + 5
        p1.insert(5,0); p1.insert(3,2); p1.insert(2,1); // testing the order of placing nodes
        p1.display();
        
        DCLL p2 = new DCLL();
        // 5x^2 + 4x + 3
        p2.insert(4,3); p2.insert(1,1); p2.insert(2,0); 
        p2.display();
        
        // Result
        DCLL result = addPoly(p1, p2);
        result.display();
    }
    
}
