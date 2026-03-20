import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("==================================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==================================================\n");

        // Create a dynamic list to store train bogies
        // Using List interface with ArrayList implementation for flexibility
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Display the count using the size() method of the List
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display the actual consist (currently empty)
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}
