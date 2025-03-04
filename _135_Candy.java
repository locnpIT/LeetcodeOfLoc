import java.util.Arrays;

public class _135_Candy {

    public static void main(String[] args) {
        int ratings[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(candy(ratings));
    }

    static int candy(int[] ratings) {
        int total = 0;
        int len = ratings.length;
        int[] arr = new int[len];
        Arrays.fill(arr, 1);

        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }

        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
