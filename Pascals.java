import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pascals {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 1; j < i; j++) {
                temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }

            if (i > 0) {
                temp.add(1);
            }

            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        Pascals obj = new Pascals();
        System.out.println(obj.generate(rows));
        sc.close();
    }
}