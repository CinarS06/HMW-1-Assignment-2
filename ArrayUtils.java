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
    // average
    public static double average(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return (double) sum / arr.length;
    }

    // differences from average
    public static double[] differencesFromAverage(int[] arr) {
        double avg = average(arr);
        double[] diffs = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            diffs[i] = arr[i] - avg;
        }
        return diffs;
    }

    // Sum of the even numbers(0,2,4...)
    public static int  sumEvenIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    //sum of the odd numbers (1,3,5...)
    public static int sumOddIndex(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}


   
