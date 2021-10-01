package algorithms;

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
}
