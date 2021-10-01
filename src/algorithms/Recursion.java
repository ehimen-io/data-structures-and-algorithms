package algorithms;

import datastructures.LinkedList;
import datastructures.Node;

public class Recursion {
    // Recursively reverses the contents of an array in-place given a pointer to the
    // left and
    // right element
    public static int[] reverseSubArray(int[] array, int left, int right) {
        // Base Case
        if (left >= right) {
            return array;
        }
        // Recursive Case
        array = Recursion.reverseSubArray(array, left + 1, right - 1);
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
        return array;

    }

    // Recursively reverses the contents of an array in-place
    public static void reverseArray(int[] array) {
        reverseSubArray(array, 0, array.length - 1);
    }

    // Recursively reverses a linked list
    public static void reverseList(LinkedList list) {
        list.head = reverseList(list.head);
    }

    public static Node reverseList(Node head) {
        // Base Case
        if (!head.hasNextNode()) {
            return head;
        }
        // Recursive case
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Recursively searches a list for a value. Returns empty string if not found
    public static boolean searchList(LinkedList list, String value) {
        return false;
    }
}
