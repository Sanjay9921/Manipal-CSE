// Ascending Priority Queue
// Using Minimum Heap

package MyPQ;

public class PriorityQueue {
    private int[] heap;
    private int maxSize;
    private int currentSize;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        currentSize = 0;
    }

    public void insert(int value) throws QueueOverflow{
        if (currentSize == maxSize) {
            throw new QueueOverflow();
        }
        heap[currentSize] = value;
        trickleUp(currentSize++);
    }

    private void trickleUp(int index) {
        int parent = (index - 1) / 2;
        int bottom = heap[index];

        while (index > 0 && heap[parent] > bottom) {
            heap[index] = heap[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heap[index] = bottom;
    }

    public int remove() throws QueueUnderflow{
        if (currentSize == 0) {
            throw new QueueUnderflow();
        }
        int root = heap[0];
        heap[0] = heap[--currentSize];
        trickleDown(0);
        return root;
    }

    private void trickleDown(int index) {
        int largerChild;
        int top = heap[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heap[leftChild] > heap[rightChild])
                largerChild = rightChild;
            else
                largerChild = leftChild;

            if (top <= heap[largerChild])
                break;

            heap[index] = heap[largerChild];
            index = largerChild;
        }
        heap[index] = top;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void display() throws QueueUnderflow{
        if (currentSize == 0) {
            throw new QueueUnderflow();
        }
        
        System.out.print("Priority Queue (ascending): ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
