import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================\n");

        // Initialize a LinkedHashSet to maintain insertion order and ensure uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // 1. Attach bogies to the formation
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 2. Attempt to add a duplicate bogie intentionally
        // LinkedHashSet will ignore this to prevent duplicate attachments
        trainFormation.add("Sleeper");

        // 3. Display the final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...");
    }
}