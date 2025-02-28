import java.util.Arrays;

public class _88MergeSortedArray {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 0, 0, 0, 0};
        int b[] = {2, 4, 5, 8};

        mergeSortedArray(a, 4, b, 4);
        System.out.println(Arrays.toString(a));


    }

    static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }


    }
    
}
