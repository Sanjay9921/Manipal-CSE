package l2q6;

public class L2Q6 {
    public static void main(String[] args) {
        int capacity = 10;
        int n = 3; // Three stacks
        NStacks nkstacks = new NStacks(capacity, n);

        nkstacks.ADD(15, 2);
        nkstacks.ADD(45, 2);
        nkstacks.ADD(17, 1);
        nkstacks.ADD(49, 1);
        nkstacks.ADD(39, 1);
        nkstacks.ADD(11, 0);
        nkstacks.ADD(9, 0);
        nkstacks.ADD(7, 0);

        System.out.println("Popped element from stack 2: " + nkstacks.DELETE(2));
    }
    
}
