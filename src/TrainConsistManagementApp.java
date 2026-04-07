import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // ... (Previous UC code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile the patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. Test Cases (Valid and Invalid)
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            boolean isValid = matcher.matches();
            System.out.println("ID: " + id + " -> " + (isValid ? "VALID" : "INVALID"));
        }

        System.out.println("\n--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            boolean isValid = matcher.matches();
            System.out.println("Code: " + code + " -> " + (isValid ? "VALID" : "INVALID"));
        }

        System.out.println("\nUC11 validation logic completed...");
    }
}