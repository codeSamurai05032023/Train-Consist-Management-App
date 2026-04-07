import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Model for Goods Bogies used in UC12
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " [" + cargo + "]";
        }
    }

    public static void main(String[] args) {
        // ... (Previous UC1 to UC11 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC12 - Safety Compliance Check (Goods) ");
        System.out.println("==========================================\n");

        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        // Uncomment the next line to test a safety violation:
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Current Goods Consist:");
        goodsConsist.forEach(System.out::println);

        // 2. Define the Safety Rule using allMatch()
        // Rule: IF the type is Cylindrical, THEN the cargo MUST be Petroleum.
        // Logic: (Not Cylindrical) OR (Is Cylindrical AND Cargo is Petroleum)
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are always safe in this context
        });

        // 3. Display the safety result
        System.out.println("\n--- Safety Validation Result ---");
        if (isSafe) {
            System.out.println("STATUS: SAFE");
            System.out.println("All cylindrical bogies are carrying Petroleum. Train is compliant.");
        } else {
            System.out.println("STATUS: UNSAFE");
            System.out.println("DANGER: Cylindrical bogie detected with non-petroleum cargo!");
        }

        System.out.println("\nUC12 safety check completed...");
    }
}