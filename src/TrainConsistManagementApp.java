import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC1 to UC17 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==========================================\n");

        // 1. Create an array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. Define the search key
        String searchKey = "BG309";
        boolean isFound = false;
        int position = -1;

        System.out.println("Consist IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for Bogie ID: " + searchKey);

        // 3. Linear Search Logic: Sequential Traversal
        for (int i = 0; i < bogieIds.length; i++) {
            // Equality Comparison using .equals() for Strings
            if (bogieIds[i].equals(searchKey)) {
                isFound = true;
                position = i;
                break; // Early Termination: stop as soon as a match is found
            }
        }

        // 4. Display the result
        if (isFound) {
            System.out.println("Result: Bogie " + searchKey + " found at position " + (position + 1));
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found in the consist.");
        }

        // 5. Testing a "Not Found" case for validation
        String missingKey = "BG999";
        boolean foundMissing = false;
        for (String id : bogieIds) {
            if (id.equals(missingKey)) {
                foundMissing = true;
                break;
            }
        }
        System.out.println("Searching for Bogie ID: " + missingKey + " -> Found? " + foundMissing);

        System.out.println("\nUC18 linear search completed...");
    }
}