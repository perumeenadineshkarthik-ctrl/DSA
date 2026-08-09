import java.util.Scanner;

public class Snapchatstreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
        
        // Your code goes here
        int snapstreak=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]>=1&&b[i]>=1){
                snapstreak++;
                if(snapstreak>ans){
                    ans=snapstreak;
                }
            }
            else{
                snapstreak=0;
            }
        }
        System.out.println(ans);
    }}
}
