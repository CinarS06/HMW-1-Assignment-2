import java.util.Random;

public class ArrayUtils {
    private static final Random RAND = new Random();

    // Create random numbers [0,100]
    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RAND.nextInt(101); // 0–100
        }
        return arr;
    }

    // Minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
        }
        return min;
    }

    // Maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) max = v;
        }
        return max;
    }

   