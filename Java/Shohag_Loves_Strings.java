import java.util.Scanner;

public class Shohag_Loves_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            int n = s.length();

            // Check for consecutive identical characters
            for (int j = 0; j < n - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    System.out.println(s.substring(j, j + 2));
                    return;
                }
            }

            // Check for three distinct consecutive characters
            for (int j = 0; j < n - 2; j++) {
                if (s.charAt(j) != s.charAt(j + 1) &&
                        s.charAt(j) != s.charAt(j + 2) &&
                        s.charAt(j + 1) != s.charAt(j + 2)) {
                    System.out.println(s.substring(j, j + 3));
                    return;
                }
            }
        }
        System.out.println("-1");
        scanner.close();
    }
}
