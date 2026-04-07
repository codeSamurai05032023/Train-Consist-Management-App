import java.util.ArrayList;
import java.util.List;

// 1. Define the Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    // 2. Updated Bogie Model with Validation
    static class Bogie {
        String name;
        int capacity;

        // Constructor now declares it might throw an exception
        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                // Throwing the custom exception if business rules are violated
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        // ... (Previous UC code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==========================================\n");

        List<Bogie> validConsist = new ArrayList<>();

        // 3. Testing Valid Bogie Creation
        try {
            System.out.println("Attempting to create valid bogies...");
            validConsist.add(new Bogie("Sleeper", 72));
            validConsist.add(new Bogie("AC Chair", 56));
            System.out.println("Status: Valid bogies created successfully.\n");
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 4. Testing Invalid Bogie Creation (Zero Capacity)
        try {
            System.out.println("Attempting to create a bogie with 0 capacity...");
            new Bogie("General", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // 5. Testing Invalid Bogie Creation (Negative Capacity)
        try {
            System.out.println("\nAttempting to create a bogie with -10 capacity...");
            new Bogie("First Class", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}