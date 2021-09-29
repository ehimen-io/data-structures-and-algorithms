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
        int current = this.tail - 1;
        int swapCount = 0;

    }

    private void heapifyDown() {
        int currentIndex = this.tail - 1;
    }

    private void swap(int firstIndex, int lastIndex) {
        int firstElement = this.heap.get(firstIndex);
        int lastElement = this.heap.get(lastIndex);
        this.heap.add(lastIndex, firstElement);
        this.heap.add(firstIndex, lastElement);
    }

    private static int getParent(int index) {
        return (int) Math.floor(index / 2);
    }

    private static int getLeft(int index) {
        return (int) Math.floor(index * 2);
    }

    private static int getRight(int index) {
        return (int) Math.floor(index * 2) + 1;
    }

    public void print() {
        System.out.println(this.heap.toString());
    }

}
