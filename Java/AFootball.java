import java.util.Scanner;

public class AFootball {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String t = n.next();

        if(t.contains("0000000") || t.contains("1111111")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
    }
}
