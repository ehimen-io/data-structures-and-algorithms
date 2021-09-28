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
        int head = this.heap.remove(0);
        int tail = this.heap.remove(this.tail - 1);
        this.heap.add(0, tail);
        this.heapifyDown();
        return head;
    }

    private void heapifyUp() {

    }

    private void heapifyDown() {

    }

    private void swap(int firstIndex, int lastIndex) {
        int firstElement = this.heap.get(firstIndex);
        int lastElement = this.heap.get(lastIndex);
        this.heap.add(lastIndex, firstElement);
        this.heap.add(firstIndex, lastElement);
    }

    private int getParent(int index) {
        return (int) Math.floor(index / 2);
    }

    private int getLeft(int index) {
        return (int) Math.floor(index * 2);
    }

    private int getRight(int index) {
        return (int) Math.floor(index * 2) + 1;
    }

    public void print() {

    }

}
