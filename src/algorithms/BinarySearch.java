package algorithms;

public class BinarySearch {

    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length;

        while (right > left) {
            int mid = (int) Math.floor((left + right) / 2);
            int current = array[mid];

            if (current == target) {
                return mid;
            } else if (current < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
