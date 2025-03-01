import java.util.Arrays;

public class _2460ApplyOperationToAnArray {
    
    public static void main(String[] args) {

        int[] a = {1,2,2,3,4};
        System.out.println(Arrays.toString(applyOperation(a)));


        
    }


    static int[] applyOperation(int nums[]){

        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i +  1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int index = 0;
        int [] result = new int[n];
        for(int j = 0; j < n; j++){
            if(nums[j] != 0){
                result[index++] = nums[j];
            }
        }

        return result;

    }

}
