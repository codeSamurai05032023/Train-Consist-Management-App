import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Keep this model here once so all Use Cases can use it
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
        // ... (Your previous UC1 to UC9 code stays here) ...

        // --- UC10: Count Total Seats in Train ---
        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // AGGREGATE USING REDUCE
        int totalSeats = bogies.stream()
                .map(b -> b.capacity) // Extracts capacity
                .reduce(0, Integer::sum); // Sums them up

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
        System.out.println("\nUC10 aggregation completed...");
    }
}