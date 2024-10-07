import java.util.Scanner;
public class A996 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long money = scanner.nextLong();  
        long number_dollars = 0;

        while (money != 0) {
            if (money >= 100) {
                number_dollars += money / 100; 
                money %= 100; 
            } else if (money >= 20) {
                number_dollars += money / 20; 
                money %= 20; 
            } else if (money >= 10) {
                number_dollars += money / 10; 
                money %= 10; 
            } else if (money >= 5) {
                number_dollars += money / 5;
                money %= 5;
            } else {
                number_dollars += money;
                money = 0; 
            }
        }

        System.out.println(number_dollars);
    }
}
