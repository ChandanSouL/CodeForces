import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long k = scanner.nextLong();

        // Count of odd numbers in the sequence
        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            // k-th number is in the odd sequence
            System.out.println(2 * k - 1);
        } else {
            // k-th number is in the even sequence
            System.out.println(2 * (k - oddCount));
        }
    }
}
