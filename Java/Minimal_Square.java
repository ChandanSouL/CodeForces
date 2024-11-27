import java.util.Scanner;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // Calculate the side length of the minimal square
            int side = Math.max(2 * Math.min(a, b), Math.max(a, b));
            int area = side * side;

            // Print the result for this test case
            System.out.println(area);
        }

        scanner.close();
    }
}
