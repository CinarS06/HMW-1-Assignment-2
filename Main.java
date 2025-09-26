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

    public static void main(String[] args) {
        while (true) {
            printMenu();
            String choice = SC.nextLine().trim();

            switch (choice) {
                case "1": {
                    System.out.print("Enter array size (>0): ");
                    try {
                        int n = Integer.parseInt(SC.nextLine().trim());
                        if (n <= 0) {
                            System.out.println("Size must be greater than 0.");
                            break;
                        }
                        arr = ArrayUtils.createRandomArray(n);
                        System.out.println("Array created.");
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid number.");
                    }
                    break;
                }
                case "2": { 
                    if (!ensureArrayReady()) break;
                    System.out.println("Array: " + Arrays.toString(arr));
                    break;
                }
                case "3": { 
                    if (!ensureArrayReady()) break;
                    System.out.println("Minimum: " + ArrayUtils.findMin(arr));
                    break;
                }
                    case "4": { 
                    if (!ensureArrayReady()) break;
                    System.out.println("Maximum: " + ArrayUtils.findMax(arr));
                    break;
                }
                case "5": { 
                    if (!ensureArrayReady()) break;
                    double avg = ArrayUtils.average(arr);
                    double[] diffs = ArrayUtils.differencesFromAverage(arr);
                    System.out.println("Average: " + avg);
                    System.out.println("Differences from average: " + Arrays.toString(diffs));
                    break;
                }
                case "6": { 
                    if (!ensureArrayReady()) break;
                    int evenSum = ArrayUtils.sumEvenIndex(arr); 
                    int  oddSum  = ArrayUtils.sumOddIndex(arr);  
                    System.out.println("Sum of even indexes: " + evenSum);
                    System.out.println("Sum of odd indexes:  " + oddSum);
                    break;
                }
                case "0":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            }
        }
    }
