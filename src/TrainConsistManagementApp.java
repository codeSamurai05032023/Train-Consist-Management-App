import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Reusing Bogie model from previous Use Cases
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        // ... (Previous UC1 to UC12 code remains here) ...

        System.out.println("==========================================");
        System.out.println(" UC13 - Performance: Loops vs Streams ");
        System.out.println("==========================================\n");

        // 1. Prepare a large collection of bogies for benchmarking
        List<Bogie> largeConsist = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeConsist.add(new Bogie("Sleeper", 72));
            largeConsist.add(new Bogie("AC Chair", 56));
        }

        // 2. Benchmarking Loop-Based Filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : largeConsist) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // 3. Benchmarking Stream-Based Filtering
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = largeConsist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // 4. Display Results
        System.out.println("Loop-Based Filtering Time   : " + loopDuration + " ns");
        System.out.println("Stream-Based Filtering Time : " + streamDuration + " ns");

        System.out.println("\nVerification:");
        System.out.println("Loop Results Count   : " + loopFiltered.size());
        System.out.println("Stream Results Count : " + streamFiltered.size());

        if (loopFiltered.size() == streamFiltered.size()) {
            System.out.println("STATUS: Results Match. Logic is consistent.");
        }

        System.out.println("\nUC13 performance comparison completed...");
    }
}