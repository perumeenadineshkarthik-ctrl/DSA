import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class contest1{
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        if (!sc.hasNext()) return;

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long currentSum = 0;
            long maxVal = 0;
            int maxItems = 0;

            for (int i = 0; i < n; i++) {
                currentSum += a[i];
                maxVal = Math.max(maxVal, a[i]);

                // Cost after applying discount token to the largest item seen so far
                long effectiveCost = currentSum - maxVal;

                if (effectiveCost <= k) {
                    maxItems = i + 1;
                } else {
                    // Cost exceeds K, so we cannot extend the prefix any further
                    break;
                }
            }

            sb.append(maxItems).append("\n");
        }

        System.out.print(sb.toString());
    }

    // Fast I/O helper for large inputs
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        boolean hasNext() {
            if (st != null && st.hasMoreElements()) return true;
            try {
                br.mark(1000);
                String line = br.readLine();
                if (line == null) return false;
                br.reset();
                return true;
            } catch (IOException e) {
                return false;
            }
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}