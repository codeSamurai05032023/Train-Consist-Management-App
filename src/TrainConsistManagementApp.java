import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("==========================================\n");

        // 1. Create a HashMap to store Bogie names (Key) and their Capacities (Value)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Insert capacity values using the put() method
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:");

        // 3. Iterate over the map using entrySet() to display Keys and Values
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}