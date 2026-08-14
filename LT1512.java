import java.util.HashMap;

public class LT1512 {

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        int ans = 0;

        for (int value : hm.values()) {
            int temp = value * (value - 1) / 2;
            ans += temp;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = numIdenticalPairs(nums);

        System.out.println(result);
    }
}