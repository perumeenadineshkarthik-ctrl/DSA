import java.util.*;
import java.lang.*;
import java.io.*;

class contest {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddCount = 0;
            int evenCount = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val % 2 != 0) {
                    oddCount++;
                } else {
                    evenCount++;
                }
            }
            
            int ans = 2 * Math.min(oddCount, evenCount);
            if (oddCount != evenCount) {
                ans += 1;
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}