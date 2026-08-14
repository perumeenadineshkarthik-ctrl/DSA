import java.util.HashMap;

public class Lt169{

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int majorityLimit = nums.length / 2;

        for (int num : hm.keySet()) {
            if (hm.get(num) > majorityLimit) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println(result);
    }
}