import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Define the custom Bogie class to hold multiple attributes
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Overriding toString to match the "Name -> Capacity" output format
    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================\n");

        // Initialize List of Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies as per the output snapshot
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Apply Comparator to sort by the 'capacity' field in ascending order
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}