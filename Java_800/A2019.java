import java.util.Scanner;

public class A2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();  // Length of the array
            int[] a = new int[n];  // The array
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Variables to keep track of maximum value and number of selected elements
            int maxVal = 0;
            int redCount = 0;
            
            // Traverse the array, selecting non-adjacent elements
            for (int i = 0; i < n; i++) {
                if (i == 0 || a[i - 1] != -1) {  // Ensure no two adjacent elements are selected
                    maxVal = Math.max(maxVal, a[i]);  // Update the maximum value
                    redCount++;  // Increment the count of selected elements
                    a[i] = -1;  // Mark this element as selected to avoid selecting adjacent elements
                }
            }
            
            // The score is the maximum value among red elements + the count of red elements
            int score = maxVal + redCount;
            System.out.println(score);
        }
        
        sc.close();
    }
}
