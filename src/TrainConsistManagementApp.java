import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Ensure this class remains outside your main method to be reused
static class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

        public static void main(String[] args) {
            // --- UC8 - Filter Passenger Bogies Using Streams ---
            System.out.println("==========================================");
            System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
            System.out.println("==========================================\n");

            // Initialize list of passenger bogies (same style as UC7)
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("General", 90));

            System.out.println("All Bogies:");
            bogies.forEach(System.out::println);

            // Use Java Streams to filter bogies with capacity > 60
            // This creates a new list and leaves the original 'bogies' list unchanged
            List<Bogie> filteredBogies = bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());

            System.out.println("\nFiltered Bogies (Capacity > 60):");
            if (filteredBogies.isEmpty()) {
                System.out.println("No bogies match the criteria.");
            } else {
                filteredBogies.forEach(System.out::println);
            }

            System.out.println("\nUC8 filtering completed...");
        }