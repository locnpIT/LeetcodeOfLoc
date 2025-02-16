import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr = solution(nums, 7);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] solution(int[] nums, int target) {

        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (check.containsKey(req)) {
                int[] returnArr = { check.get(req), i };
                return returnArr;
            } else {
                check.put(nums[i], i);
            }
        }
        return null;
    }

}
