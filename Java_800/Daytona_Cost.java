import java.util.ArrayList;
import java.util.Scanner;

public class Daytona_Cost{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){
            int n= scanner.nextInt();
            int k = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                array.add(scanner.nextInt());
            }
            if (array.contains(k)){
                System.out.println("YES");
//                System.out.println(n);
//                System.out.println(k);
            }else{
                System.out.println("NO");
//                System.out.println(n);
//                System.out.println(k);
            }
        }
    }
}