package algorithms;

public class QuickSort {
    public static int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    // Recursive sort function
    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot, right);
        }
        return array;
    }

    // Partition function that compares the elements at the left and right index
    // with the pivot element

    public static int partition(int[] array, int left, int right) {
        int pivot = array[(int) Math.floor((right + left) / 2)];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                BubbleSort.swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
