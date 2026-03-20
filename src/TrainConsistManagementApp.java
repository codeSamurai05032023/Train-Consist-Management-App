import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==========================================\n");

        // Initialize a LinkedList to maintain the physical sequence of the train
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Initial Train Formation
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // 2. Inserting 'Pantry Car' at position 2 (index 2)
        // LinkedList allows efficient insertion in the middle
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // 3. Removing First and Last Bogie
        // Using specific LinkedList methods to detach from head and tail
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}