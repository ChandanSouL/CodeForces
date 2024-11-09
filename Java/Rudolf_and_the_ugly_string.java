import java.util.Scanner;

public class Rudolf_and_the_ugly_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading number of test cases
        int test_cases = Integer.parseInt(scanner.nextLine());

        for (int t = 0; t < test_cases; t++) {
            // Reading integer input
            int n = Integer.parseInt(scanner.nextLine());

            // Reading string input
            String s = scanner.nextLine();
            int i = 0;
            int count = 0;

            while (i <= s.length() - 3) {
                // Check for "pie" or "map"
                if (s.substring(i, i + 3).equals("pie") || s.substring(i, i + 3).equals("map")) {
                    // Modify the string
                    s = s.substring(0, i + 1) + s.substring(i + 2);
                    count++;
                } else {
                    i++;
                }
            }
            // Print the result for each test case
            System.out.println(count);
        }

        scanner.close();
    }
}
