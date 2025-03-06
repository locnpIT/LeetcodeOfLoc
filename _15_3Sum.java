import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, -1, -2, -3};
        System.out.println(threeSum(arr));
        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listResult = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i<len - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = len - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0) left++;
                else if(sum > 0) right--;
                else{
                    
                    listResult.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }


        }

        return listResult;
    }
}
