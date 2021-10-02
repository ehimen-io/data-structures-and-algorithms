package algorithms;

import datastructures.LinkedList;
import datastructures.Node;

public class BubbleSort {

    // Sorts an array using the bubble sort algorithm
    public static void bubbleSortArray(int[] array) {
        if (array.length <= 1) {
            return;
        }
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swap = true;
                }
            }
        }
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    public static void bubbleSortList(LinkedList list) {
        Node sentinel = new Node("-1");
        sentinel.setNextNode(list.head);
        if (!list.head.hasNextNode()) {
            return;
        }
        boolean swap = true;
        while (swap) {
            Node current = list.head;
            swap = false;
            Node prev = sentinel;
            while (current != null && current.hasNextNode()) {
                if (Integer.parseInt(current.data) > Integer.parseInt(current.getNextNode().data)) {
                    // System.out.println("Swapping " + current.data + " with " +
                    // current.getNextNode().data);
                    swap(prev, current, current.getNextNode());
                    list.head = sentinel.next;
                    // list.printList();
                    swap = true;
                }
                prev = current;
                current = current.getNextNode();
            }
        }

    }

    public static void swap(Node prev, Node current, Node next) {
        if (prev != null) {
            prev.setNextNode(next);
        }

        Node temp = next.getNextNode();
        next.setNextNode(current);
        current.setNextNode(temp);
    }
}
