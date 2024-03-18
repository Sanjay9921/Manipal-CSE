package MyCircularQueue;

public class CircularQueue {
    int f1, f2, size1; // front
    int r1, r2, size2; // rear
    int size;
    int[] cqueue;
    
    public CircularQueue(int size){
        this.size = size;
        size1 = size2 = 0;
        
        f1 = r1 = -1;
        f2 = r2 = size; // start second queue from the end
        
        cqueue = new int[this.size];
    }
    
    public boolean isEmpty(int queueNum){
        if(queueNum == 1){
            return size1 == 0;
        }
        else{
            return size2 == 0;
        }
    }
    
    public boolean isFull(int queueNum){
        if(queueNum == 1){
            return size1 == size;
        }
        else{
            return size2 == size;
        }
    }
    
    public void enqueue(int queueNum, int x) throws QueueOverflow{
        if(queueNum == 1){
            if(isFull(1)){
                throw new QueueOverflow();
            }
            
            if(isEmpty(1)){
                f1 = 0;
            }
            
            r1 = (r1+1)%size;
            cqueue[r1] = x;
            size1++;
        }
        else{
            if(isFull(2)){
                throw new QueueOverflow();
            }
            
            if(isEmpty(2)){
                f2 = size - 1;
            }
            
            r2 = (r2-1+size)%size;
            cqueue[r2] = x;
            size2++;
        }
    }
    
    public int dequeue(int queueNum) throws QueueUnderflow{
        if(queueNum == 1){
            if(isEmpty(1)){
                throw new QueueUnderflow();
            }
            
            int x = cqueue[f1];
            
            if(f1 == r1){
                f1 = r1 = -1; // reset
            }
            else{
                f1 = (f1 + 1)%size;
            }
            
            size1--;
            return x;
        }
        else{
            if(isEmpty(2)){
                throw new QueueUnderflow();
            }
            
            int x = cqueue[f2];
            
            if(f2 == r2){
                f2 = r2 = size; // reset
            }
            else{
                f2 = (f2 + 1 + size)%size;
            }
            
            size2--;
            return x;
        }
    }
    
    public int peek(int queueNum) throws QueueUnderflow{
        if(isEmpty(queueNum)){
            throw new QueueUnderflow();
        }
        
        return (queueNum==1? cqueue[f1] : cqueue[f2]);
    }
}
