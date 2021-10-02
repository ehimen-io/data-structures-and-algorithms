package algorithms;

import java.util.Arrays;

public class MergeSort {

    // Recursive function that splits the array into left and right
    public static int[] sort(int[] array) {
        // Base case
        int length = array.length;
        if (length == 1) {
            return array;
        }
        // Recursive case
        int mid = (int) Math.floor(length / 2);
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, length);

        return merge(sort(left), sort(right));

    }

    // Iterative function that merges the left and right arrays according to the
    // contents
    public static int[] merge(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int pointer = 0;

        while (left.length > 0 && right.length > 0) {
            if (left[0] < right[0]) {
                sortedArray[pointer] = left[0];
                left = shiftArray(left);
            } else {
                sortedArray[pointer] = right[0];
                right = shiftArray(right);
            }
            pointer++;
        }
        concatenate(sortedArray, left, right, pointer);

        // System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }

    // Helper function that pops the first item from the array and returns a new
    // array
    public static int[] shiftArray(int[] array) {
        int[] newArray = new int[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        return newArray;

    }

    // Helper function that concatenates the left and right array into the sorted
    // array
    public static void concatenate(int[] sortedArray, int[] left, int[] right, int pointer) {
        while (left.length > 0) {
            sortedArray[pointer] = left[0];
            left = shiftArray(left);
            pointer++;
        }

        while (right.length > 0) {
            sortedArray[pointer] = right[0];
            right = shiftArray(right);
            pointer++;
        }
    }

}
