import java.util.HashMap;
import java.util.Scanner;

public class Fair_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of candies
            int ones = 0, twos =0;
            for (int i = 0; i < n; i++) {
                int weight = scanner.nextInt();
                if (weight == 1) {
                    ones++;
                } else if (weight == 2) {
                    twos++;
                }
            }
            if (n % 2 == 0 && ones % 2 ==0 && ones > 1) {
                    System.out.println("YES");
                }else{
                System.out.println("NO");
            }
        }
    }
}
