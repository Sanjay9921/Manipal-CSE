package MyDCLL;

public class Node {
    public int coef;
    public int exp;
    
    public Node next;
    public Node prev;

    public Node(int coefficient, int exponent) {
        this.coef = coefficient;
        this.exp = exponent;
        
        this.prev = this.next = null;
    }
}
