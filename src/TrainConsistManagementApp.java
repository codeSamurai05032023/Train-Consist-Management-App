import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC1 to UC19 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");

        // 1. Scenario: An empty train consist
        String[] emptyBogieIds = {};
        String searchKey = "BG101";

        System.out.println("Current Consist: " + Arrays.toString(emptyBogieIds));
        System.out.println("Search Attempt for: " + searchKey);

        try {
            // 2. Perform Search with Defensive Validation
            performSafeSearch(emptyBogieIds, searchKey);
        } catch (IllegalStateException e) {
            // 3. Catching the fail-fast exception
            System.err.println("ALERT: " + e.getMessage());
        }

        // 4. Scenario: A valid train consist
        String[] validBogieIds = {"BG101", "BG205", "BG309"};
        System.out.println("\nAdding bogies to train...");
        try {
            performSafeSearch(validBogieIds, "BG205");
        } catch (IllegalStateException e) {
            System.err.println("ALERT: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive validation completed...");
    }

    /**
     * Helper method to demonstrate State Validation and Search logic
     */
    public static void performSafeSearch(String[] ids, String key) {
        // STATE VALIDATION: Check if collection is empty before searching
        if (ids == null || ids.length == 0) {
            throw new IllegalStateException("Search failed: No bogies are available in the train consist.");
        }

        // If validation passes, proceed with search (Binary Search from UC19)
        Arrays.sort(ids);
        int result = Arrays.binarySearch(ids, key);

        if (result >= 0) {
            System.out.println("SUCCESS: Bogie " + key + " found at index " + result);
        } else {
            System.out.println("RESULT: Bogie " + key + " not found in the current consist.");
        }
    }
}