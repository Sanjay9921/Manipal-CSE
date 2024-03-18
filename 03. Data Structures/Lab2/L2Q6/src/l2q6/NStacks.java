package l2q6;

public class NStacks {
    int[] arr; // Main array to store stack data
    int[] top; // Array to store top index of each stack
    int[] next; // Array to manage free spaces for efficient allocation
    int capacity; // Total capacity of the array
    int n; // Number of stacks
    int free; // Index of the first free slot in the array

    // Constructor
    public NStacks(int capacity, int n) {
        this.capacity = capacity;
        this.n = n;
        arr = new int[capacity];
        top = new int[n];
        next = new int[capacity];

        // Initialize top and next arrays
        for (int i = 0; i < n; i++) {
            top[i] = -1; // Initially empty stacks
        }

        // Set up a free list in the array using next[]
        for (int i = 0; i < capacity - 1; i++) {
            next[i] = i + 1; // Initialize each free slot's next pointer
        }
        next[capacity - 1] = -1; // Mark the last slot as the end of the free list

        free = 0; // Initially, the first slot is free
    }

    // Check if a particular stack is full
    boolean isFull() {
        return free == -1; // No free slots indicate all stacks are full
    }

    // Check if a particular stack is empty
    boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    // Push an element x to stack number sn
    void ADD(int x, int sn) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        // Notice the circular dependency / pattern
        
        int i = free; // Get the index of the next free slot
        free = next[i]; // Update free list for efficient allocation
        next[i] = top[sn]; // Insert the element and update top and next pointers // Link the new element to the current top
        top[sn] = i; // Update the top of the stack
        
        arr[i] = x; // Store the element in the array
    }

    // Pop an element from stack number sn
    int DELETE(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE; // Or any default value to indicate underflow
        }

        // Notice the circular dependency / pattern
        // Its just the reverse of ADD function
        
        int i = top[sn]; // Get the index of the top element
        top[sn] = next[i]; // Update top and next pointers for removal
        next[i] = free; // Return the popped element to the free list
        free = i;

        return arr[i];
    }
}
