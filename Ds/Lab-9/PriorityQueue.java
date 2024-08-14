// 53. Implement Priority Queue using array that performs following operations: 
// INSERT, DELETE, DISPLAY

import java.util.*;
class PriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Heap is 1-indexed
    }

    private int parent(int i) {
        return i / 2;
    }

    private int leftChild(int i) {
        return 2 * i;
    }

    private int rightChild(int i) {
        return 2 * i + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyUp(int i) {
        while (i > 1 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    public void insert(int key) {
        if (size >= capacity) {
            System.out.println("Priority Queue is full");
            return;
        }
        heap[++size] = key;
        heapifyUp(size);
    }

    public int extractMin() {
        if (size == 0) {
            System.out.println("Priority Queue is empty");
            return Integer.MIN_VALUE;
        }
        int min = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return min;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Priority Queue is empty");
            return Integer.MIN_VALUE;
        }
        return heap[1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.insert(4);
        pq.insert(2);
        pq.insert(5);
        pq.insert(1);
        pq.insert(3);

        while (!pq.isEmpty()) {
            System.out.println(pq.extractMin());
        }
    }
}
