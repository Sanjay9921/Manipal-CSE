package l1q5;

public class TowerOfHanoi {
    private int moves=0;
    
    public void towerOfHanoi(int currentDisk, char src, char dest, char aux){
        if(currentDisk == 1){
            System.out.println("Move Disk " + currentDisk + " from " + src + " to " + dest);
            moves++;
            return;
        }
        
        towerOfHanoi(currentDisk-1, src, aux, dest);
        System.out.println("Move Disk " + currentDisk + " from " + src + " to " + dest);
        moves++;
        towerOfHanoi(currentDisk-1, aux, dest, src);
    }

    public int getMoves() {
        return moves;
    }
}
