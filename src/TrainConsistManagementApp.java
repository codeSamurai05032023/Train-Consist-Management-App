import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Reusing the Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Getter for the name to use in grouping logic
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " (Cap: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("==========================================\n");

        // 1. Create a list with multiple bogies of the same type for testing
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Initial Flat List of Bogies:");
        bogies.forEach(System.out::println);

        // 2. Use Stream API with Collectors.groupingBy()
        // This classifies bogies by their name/type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // 3. Display the structured Map result
        System.out.println("\nGrouped Bogie Structure (Map):");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });

        // Validation for Test Cases
        System.out.println("\n--- Operational Summary ---");
        System.out.println("Total Categories Found: " + groupedBogies.size());
        System.out.println("Sleeper Count: " + (groupedBogies.containsKey("Sleeper") ? groupedBogies.get("Sleeper").size() : 0));

        System.out.println("\nUC9 grouping operation completed...");
    }
}