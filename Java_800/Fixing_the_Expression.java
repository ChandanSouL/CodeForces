import java.util.Scanner;

public class Fixing_the_Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each test case
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();

            // Extract components of the expression
            char firstChar = s.charAt(0);
            char operator = s.charAt(1);
            char lastChar = s.charAt(2);

            int firstDigit = firstChar - '0';
            int lastDigit = lastChar - '0';

            // Validate the expression and modify if necessary
            if ((operator == '<' && firstDigit < lastDigit) ||
                    (operator == '>' && firstDigit > lastDigit) ||
                    (operator == '=' && firstDigit == lastDigit)) {
                // Expression is already true
                System.out.println(s);
            } else {
                // Modify the operator to make the expression true
                if (firstDigit < lastDigit) {
                    System.out.println(firstChar + "<" + lastChar);
                } else if (firstDigit > lastDigit) {
                    System.out.println(firstChar + ">" + lastChar);
                } else {
                    System.out.println(firstChar + "=" + lastChar);
                }
            }
        }

        scanner.close();
    }
}
