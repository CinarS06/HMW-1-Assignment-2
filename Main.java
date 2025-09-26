import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);
    private static int[] arr = null;

    private static void printMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1) Create random int array [0..100]");
        System.out.println("2) Print the array");
        System.out.println("3) Find minimum");
        System.out.println("4) Find maximum");
        System.out.println("5) Average and differences from average");
        System.out.println("6) Sum of even-indexed and odd-indexed elements");
        System.out.println("0) Exit");
        System.out.print("Choice: ");
    }

    private static boolean ensureArrayReady() {
        if (arr == null) {
            System.out.println("Please create the array first (option 1).");
            return false;
        }
        return true;
    }
