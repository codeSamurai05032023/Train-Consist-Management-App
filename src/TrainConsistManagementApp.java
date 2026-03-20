import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("==========================================\n");

        // Initialize a HashSet to ensure all Bogie IDs are unique
        Set<String> bogieIds = new HashSet<>();

        // Adding Bogie IDs (including an intentional duplicate)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        // Attempting to add a duplicate ID
        bogieIds.add("BG101");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}