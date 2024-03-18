package l1q5;

public class L1Q5 {
    public static void main(String[] args) {
        TowerOfHanoi toh1 = new TowerOfHanoi();
        toh1.towerOfHanoi(3, 'A', 'C', 'B'); // number of disks, source, destination, auxillary
        System.out.println("The total number of moves taken for the simulation: " + toh1.getMoves());
    }
    
}
