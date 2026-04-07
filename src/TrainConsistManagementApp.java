import java.util.ArrayList;
import java.util.List;

// 1. Define a Custom Runtime Exception for Operational Safety
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    // 2. Updated GoodsBogie with an assignment method
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
            this.cargo = "Empty";
        }

        // Method to assign cargo with safety validation
        public void assignCargo(String newCargo) {
            System.out.println("Attempting to assign " + newCargo + " to " + shape + " bogie...");

            // Logic: Petroleum is ONLY allowed in Cylindrical bogies
            if (newCargo.equalsIgnoreCase("Petroleum") && !shape.equalsIgnoreCase("Cylindrical")) {
                throw new CargoSafetyException("DANGER: Petroleum cannot be carried in a " + shape + " bogie!");
            }

            this.cargo = newCargo;
            System.out.println("Success: Cargo assigned successfully.");
        }

        @Override
        public String toString() {
            return shape + " Bogie [Cargo: " + cargo + "]";
        }
    }

    public static void main(String[] args) {
        // ... (Previous UC code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC15 - Safe Cargo Assignment (Try-Catch) ");
        System.out.println("==========================================\n");

        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        // 3. Structured Exception Handling (Valid Case)
        try {
            cylindricalBogie.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Log: Assignment attempt for Cylindrical bogie completed.\n");
        }

        // 4. Structured Exception Handling (Unsafe Case)
        try {
            rectangularBogie.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {
            // This block prevents the app from crashing
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Action: Assignment blocked. Train remains safe.");
        } finally {
            // This block ALWAYS executes (cleanup/logging)
            System.out.println("Log: Assignment attempt for Rectangular bogie completed.");
        }

        System.out.println("\nFinal Consist State:");
        System.out.println(cylindricalBogie);
        System.out.println(rectangularBogie);

        System.out.println("\nUC15 structured error handling completed...");
    }
}