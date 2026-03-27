import java.util.Scanner;

public class Solution {

    // Generic method to find the maximum element in an array
    // T extends Comparable<T> ensures the type has a compareTo method
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Integer Array Processing ---
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }
            System.out.println("Max Integer: " + findMax(intArray));
        }

        // --- String Array Processing ---
        if (scanner.hasNextInt()) {
            int m = scanner.nextInt();
            String[] stringArray = new String[m];
            for (int i = 0; i < m; i++) {
                stringArray[i] = scanner.next();
            }
            System.out.println("Max String: " + findMax(stringArray));
        }

        scanner.close();
    }
}
