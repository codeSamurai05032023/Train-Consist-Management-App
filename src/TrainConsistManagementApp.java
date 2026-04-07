import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC1 to UC18 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search (Optimized) ");
        System.out.println("==========================================\n");

        // 1. Data Preparation: IDs must be sorted for Binary Search to work
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG309";

        System.out.println("Original List: " + Arrays.toString(bogieIds));

        // Sorting the array (Precondition)
        Arrays.sort(bogieIds);
        System.out.println("Sorted List:   " + Arrays.toString(bogieIds));

        // 2. Binary Search Pointers
        int low = 0;
        int high = bogieIds.length - 1;
        int foundAt = -1;

        // 3. The Search Loop
        while (low <= high) {
            // Find the middle index
            int mid = low + (high - low) / 2;

            // Compare the search key with the value at the middle
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                foundAt = mid; // Match found!
                break;
            } else if (comparison > 0) {
                low = mid + 1; // Key is higher, ignore the left half
            } else {
                high = mid - 1; // Key is lower, ignore the right half
            }
        }

        // 4. Output the Result
        System.out.println("\nSearching for ID: " + searchKey);
        if (foundAt != -1) {
            System.out.println("Success: Bogie found at sorted index " + foundAt);
        } else {
            System.out.println("Result: Bogie ID not found in the system.");
        }

        System.out.println("\nUC19 optimized search completed...");
    }
}