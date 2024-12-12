import java.util.*;

public class Game_with_Coloured_Marbles {

    // Function to calculate Alice's score for a single test case
    public static int calculateAliceScore(int n, int[] marbles) {
        // Step 1: Count the frequency of each color
        Map<Integer, Integer> colorCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            colorCount.put(marbles[i], colorCount.getOrDefault(marbles[i], 0) + 1);
            System.out.println(colorCount);
        }

        // Step 2: Sort the frequencies in descending order
        List<Integer> frequencies = new ArrayList<>(colorCount.values());
        Collections.sort(frequencies, Collections.reverseOrder());
        System.out.println(frequencies);

        // Step 3: Simulate the game between Alice and Bob
        int aliceScore = 0;

        // Alice tries to take as many distinct colors as possible and take all marbles of some colors
        for (int i = 0; i < frequencies.size(); i++) {
            int count = frequencies.get(i);

            if (i % 2 == 0) { // Alice's turn
                aliceScore += 1;  // Alice will get at least one marble of this color
                if (count == 1) {
                    aliceScore += 1;  // Alice gets full points if there's only one marble of this color
                }
            } else { // Bob's turn
                if (count > 1) {
                    // Bob can block Alice from taking all marbles of this color
                }
            }
        }

        return aliceScore;
    }

    public static void main(String[] args) {
        // Read number of test cases
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the number of marbles for the current test case
            int n = scanner.nextInt();
            int[] marbles = new int[n];

            // Read the marbles' colors
            for (int j = 0; j < n; j++) {
                marbles[j] = scanner.nextInt();
            }

            // Calculate Alice's score for this test case
            int score = calculateAliceScore(n, marbles);
            System.out.println(score);
        }

        scanner.close();
    }
}
