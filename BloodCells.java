import java.util.*;

class BloodCells {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        String cells = sc.next();
        
        int currentW = 0;
        for (int i = 0; i < k; i++) {
            if (cells.charAt(i) == 'W') {
                currentW++;
            }
        }
        
        int minW = currentW;
        
        for (int i = k; i < n; i++) {
            if (cells.charAt(i - k) == 'W') {
                currentW--;
            }
            if (cells.charAt(i) == 'W') {
                currentW++;
            }
            minW = Math.min(minW, currentW);
        }
        
        System.out.println(minW);
        sc.close();
    }
}