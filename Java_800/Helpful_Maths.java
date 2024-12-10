import java.util.Scanner;

public class Helpful_Maths{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if (c == '1'){
                count1++;
            } else if (c == '2') {
                count2++;
            }
            else if (c == '3'){
                count3++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count1; i++){
            result.append("1+");
        }
        for(int i = 0; i < count2; i++){
            result.append("2+");
        }
        for(int i = 0; i < count3; i++){
            result.append("3+");
        }

        if (result.length() > 0){
            result.setLength(result.length() - 1);
        }

        System.out.println(result);

        scanner.close();
    }
}