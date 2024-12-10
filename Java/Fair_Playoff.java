import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            ArrayList<Integer> strengths = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                strengths.add(scanner.nextInt());
            }

            // Find the two strongest players and their original positions
            int max1 = Math.max(strengths.get(0), strengths.get(1));
            int max2 = Math.max(strengths.get(2), strengths.get(3));

            // Get the two strongest overall players
            Collections.sort(strengths); // Sort to find the strongest two
            int strongest1 = strengths.get(3); // Largest
            int strongest2 = strengths.get(2); // Second largest

            // Check if the strongest players are from different pairs
            if ((max1 == strongest1 || max1 == strongest2) && (max2 == strongest1 || max2 == strongest2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
