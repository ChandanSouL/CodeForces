import java.util.*;

public class Vasilije_in_Cacak{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while(t-- > 0){
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();

            long min_sum = (long) k * (k+1) / 2;
            long max_sum = (long) k * (2 * n - k + 1) / 2;

            if (max_sum >= x && min_sum <= x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}