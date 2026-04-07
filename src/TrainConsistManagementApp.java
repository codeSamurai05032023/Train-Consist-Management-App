import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC1 to UC15 code remains here) ...

        System.out.println("==================================================");
        System.out.println(" UC16 - Sort Passenger Bogies (Bubble Sort) ");
        System.out.println("==================================================\n");

        // 1. Initial array of bogie capacities (unsorted)
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // 2. Bubble Sort Algorithm Logic
        // The outer loop tracks the number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            // The inner loop compares adjacent elements
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                // If the left element is greater than the right, they are out of order
                if (capacities[j] > capacities[j + 1]) {
                    // Perform Swap using a temporary variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 3. Display the sorted result
        System.out.println("After Sorting (Bubble Sort): " + Arrays.toString(capacities));

        // Validation for Test Cases
        System.out.println("\n--- Sorting Validation ---");
        boolean isSorted = true;
        for (int i = 0; i < capacities.length - 1; i++) {
            if (capacities[i] > capacities[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is array correctly sorted? " + (isSorted ? "YES" : "NO"));

        System.out.println("\nUC16 manual sorting completed...");
    }
}