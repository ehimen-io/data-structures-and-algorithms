package datastructures;

import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> heap;
    int tail;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.tail = 0;
    }

    // Adding a new number to the heap
    public void add(int element) {
        this.heap.add(this.tail, element);
        this.tail++;
        this.heapifyUp();
    }

    // Removing the minimum number from the heap
    public int remove() {
        if (this.heap.size() == 0) {
            System.out.println("Empty Heap!");
            return -1;
        }

        int head = this.heap.remove(0);
        if (this.heap.size() == 0) {
            return head;
        }
        int tail = this.heap.remove(this.heap.size() - 1);
        this.heap.add(0, tail);
        this.tail--;
        this.heapifyDown();
        return head;
    }

    // Restructures the MinHeap to make sure parentNode < childNodes
    private void heapifyUp() {
        if (this.heap.size() <= 1) {
            return;
        }
        int currentIndex = this.heap.size() - 1;
        int parentIndex = getParent(currentIndex);

        while (this.heap.get(currentIndex) < this.heap.get(parentIndex) && currentIndex > 0) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = getParent(currentIndex);
        }
    }

    // Restructures the MinHeap to make sure parentNode < childNodes
    private void heapifyDown() {
        if (this.heap.size() <= 1) {
            return;
        }
        int parent = 0;
        int left = getLeftChild(parent);
        int right = getRightChild(parent);
        int swapCode = this.canSwap(parent, left, right);

        while (swapCode > 0) {
            switch (swapCode) {
                case 3:
                    boolean chooseLeft = this.heap.get(left) <= this.heap.get(right);
                    if (chooseLeft) {
                        this.swap(parent, left);
                        parent = left;
                    } else {
                        this.swap(parent, right);
                        parent = right;
                    }
                    break;

                case 2:
                    this.swap(parent, left);
                    parent = left;
                    break;

                default:
                    this.swap(parent, right);
                    parent = right;
                    break;
            }

            left = getLeftChild(parent);
            right = getRightChild(parent);
            swapCode = this.canSwap(parent, left, right);
        }

    }

    // Returns an integer value corresponding to what element can be swapped with
    // its parent
    private int canSwap(int parent, int leftChild, int rightChild) {
        boolean leftSwap = this.exists(leftChild) && this.heap.get(parent) > this.heap.get(leftChild);
        boolean rightSwap = this.exists(rightChild) && this.heap.get(parent) > this.heap.get(rightChild);

        if (leftSwap && rightSwap) {
            return 3;
        } else if (leftSwap) {
            return 2;
        } else if (rightSwap) {
            return 1;
        } else {
            return 0;
        }
    }

    // Returns true if the index given is out of bounds
    private boolean exists(int index) {
        return index <= this.heap.size() - 1;
    }

    // Swaps the element in heap[firstIndex] with the element in heap[lastIndex]
    private void swap(int firstIndex, int lastIndex) {
        int temp = this.heap.get(lastIndex);
        this.heap.set(lastIndex, this.heap.get(firstIndex));
        this.heap.set(firstIndex, temp);
    }

    // returns the integer corresponding to the parent node of the node at
    // heap[index]
    private static int getParent(int index) {
        return (int) Math.floor(index / 2);
    }

    // returns the integer corresponding to the left child node of the node at
    // heap[index]
    private static int getLeftChild(int index) {
        return (int) Math.floor(index * 2);
    }

    // returns the integer corresponding to the right child node of the node at
    // heap[index]
    private static int getRightChild(int index) {
        return (int) Math.floor(index * 2) + 1;
    }

    // Prints a string representation of the array
    public void print() {
        System.out.println(this.heap.toString());
    }

}
