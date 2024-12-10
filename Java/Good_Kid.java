import java.util.Scanner;

public class Good_Kid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of digits
            int[] digits = new int[n];

            for (int i = 0; i < n; i++) {
                digits[i] = scanner.nextInt();
            }

            long maxProduct = 0; // To store the maximum product

            for (int i = 0; i < n; i++) {
                long currentProduct = 1;

                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        currentProduct *= (digits[j] + 1); // Add 1 to the chosen digit
                    } else {
                        currentProduct *= digits[j];
                    }
                }

                maxProduct = Math.max(maxProduct, currentProduct); // Update max product
            }

            System.out.println(maxProduct); // Output the result for this test case
        }

        scanner.close();
    }
}
