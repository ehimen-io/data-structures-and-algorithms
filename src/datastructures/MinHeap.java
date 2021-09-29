package datastructures;

import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> heap;
    int tail;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.tail = 0;
    }

    public void add(int element) {
        this.heap.add(this.tail, element);
        this.tail++;
        this.heapifyUp();
    }

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

    private boolean exists(int index) {
        return index <= this.heap.size() - 1;
    }

    private void swap(int firstIndex, int lastIndex) {
        int temp = this.heap.get(lastIndex);
        this.heap.set(lastIndex, this.heap.get(firstIndex));
        this.heap.set(firstIndex, temp);
    }

    private static int getParent(int index) {
        return (int) Math.floor(index / 2);
    }

    private static int getLeftChild(int index) {
        return (int) Math.floor(index * 2);
    }

    private static int getRightChild(int index) {
        return (int) Math.floor(index * 2) + 1;
    }

    public void print() {
        System.out.println(this.heap.toString());
    }

}
