package NQueue;

public class NCircularQueue {
    private int[] array;
    private int[] front;
    private int[] rear;
    private int[] next;
    private int[] queueIndex;
    private int free;
    private int size;

    public NCircularQueue(int N, int capacity) {
        array = new int[capacity];
        front = new int[N];
        rear = new int[N];
        next = new int[capacity];
        queueIndex = new int[capacity];
        free = 0;
        size = capacity / N;

        // Initialize front, rear, next, and queueIndex arrays
        for (int i = 0; i < N; i++) {
            front[i] = rear[i] = -1;
        }
        for (int i = 0; i < capacity - 1; i++) {
            next[i] = i + 1;
            queueIndex[i] = i / size;
        }
        next[capacity - 1] = -1;
        queueIndex[capacity - 1] = (capacity - 1) / size;
    }

    public boolean isEmpty(int queueNumber) {
        return front[queueNumber] == -1;
    }

    public boolean isFull(int queueNumber) {
        return free == -1;
    }

    public void enqueue(int queueNumber, int value) {
        if (isFull(queueNumber)) {
            System.out.println("Queue " + queueNumber + " is full.");
            return;
        }

        int i = free;
        free = next[i];

        if (isEmpty(queueNumber)) {
            front[queueNumber] = rear[queueNumber] = i;
            next[i] = i; // Point to itself for the circular behavior
        } else {
            next[rear[queueNumber]] = i;
            next[i] = front[queueNumber]; // Make it circular
            rear[queueNumber] = i;
        }

        array[i] = value;
    }

    public int dequeue(int queueNumber) {
        if (isEmpty(queueNumber)) {
            System.out.println("Queue " + queueNumber + " is empty.");
            return -1;
        }

        int i = front[queueNumber];
        int value = array[i];

        if (front[queueNumber] == rear[queueNumber]) {
            front[queueNumber] = rear[queueNumber] = -1;
        } else {
            front[queueNumber] = next[i];
        }

        next[i] = free;
        free = i;

        return value;
    }
}
