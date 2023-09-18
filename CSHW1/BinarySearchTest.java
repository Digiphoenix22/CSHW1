import java.util.Random;

public class BinarySearchTest {

    public static int binarySearch(int[] A, int x, int low, int high) {
        if (low > high) {
            return -1; // element not found
        }

        int mid = (low + high) / 2;

        if (A[mid] == x) {
            return mid; // element found
        } else if (x < A[mid]) {
            return binarySearch(A, x, low, mid - 1);
        } else {
            return binarySearch(A, x, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] sizes = {10, 100, 1_000, 10_000, 100_000, 1_000_000};
        Random rand = new Random();

        for (int size : sizes) {
            // Create array and populate with sequential integers
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }

            // Choose a random number within the array bounds
            int x = rand.nextInt(size);

            // Capture start time
            long startTime = System.nanoTime();

            // Execute binary search
            binarySearch(arr, x, 0, arr.length - 1);

            // Capture end time
            long endTime = System.nanoTime();

            // Print elapsed time for this size
            System.out.println("Size: " + size + " Time taken (nanoseconds): " + (endTime - startTime));
        }
    }
}
