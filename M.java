import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int pairs = 0;
            int oddCount = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                pairs += a[i] / 2;
                if (a[i] % 2 != 0) {
                    oddCount++;
                }
            }
            
            int alice = 0;
            if (sum % 2 == 0) {
                alice = (pairs * 2) + (oddCount / 2);
            } else {
                alice = oddCount / 2;
            }
            
            System.out.println(alice);
        }
    }
}// this is the program from codecheff starter 251 4 th problem;