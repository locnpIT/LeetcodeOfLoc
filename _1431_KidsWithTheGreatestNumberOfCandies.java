import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);

        
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = maxInArray(candies);
        int len = candies.length;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    static int maxInArray(int[] arr) {
        int len = arr.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
