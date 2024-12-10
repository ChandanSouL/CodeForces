import java.util.Scanner;

public class Anya_and_1100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            StringBuilder s = new StringBuilder(scanner.next()); // Input string
            int q = scanner.nextInt(); // Number of queries
            int n = s.length();

            // Precompute initial "1100" occurrences
            int count1100 = 0;
            for (int i = 0; i <= n - 4; i++) {
                if (s.substring(i, i + 4).equals("1100")) {
                    count1100++;
                }
            }

            // Process queries
            while (q-- > 0) {
                int i = scanner.nextInt() - 1; // Convert to 0-based index
                char v = scanner.next().charAt(0); // New character ('0' or '1')

                // Update the string and recheck substrings
                for (int start = Math.max(0, i - 3); start <= Math.min(n - 4, i); start++) {
                    if (s.substring(start, start + 4).equals("1100")) {
                        count1100--; // Remove previous occurrence
                    }
                }

                s.setCharAt(i, v); // Apply the update

                for (int start = Math.max(0, i - 3); start <= Math.min(n - 4, i); start++) {
                    if (s.substring(start, start + 4).equals("1100")) {
                        count1100++; // Add new occurrence
                    }
                }

                // Output the result for the current query
                System.out.println(count1100 > 0 ? "YES" : "NO");
            }
        }

        scanner.close();
    }
}
