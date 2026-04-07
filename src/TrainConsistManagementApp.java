import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC1 to UC16 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC17 - Sort Bogie Names (Arrays.sort) ");
        System.out.println("==========================================\n");

        // 1. Define an array of bogie type names (unsorted)
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // 2. Use Java's built-in optimized sorting method
        // This sorts the array in-place using natural alphabetical ordering
        Arrays.sort(bogieNames);

        // 3. Display the sorted result
        System.out.println("\nAfter Alphabetical Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Validation for Test Cases
        System.out.println("\n--- Alphabetical Validation ---");
        if (bogieNames[0].equals("AC Chair") && bogieNames[bogieNames.length - 1].equals("Sleeper")) {
            System.out.println("Status: Bogie names are perfectly ordered.");
        }

        System.out.println("\nUC17 library-based sorting completed...");
    }
}