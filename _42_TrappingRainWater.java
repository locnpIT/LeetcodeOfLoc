public class _42_TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));        
    }

    static int trap(int height[]){

        int len = height.length;
        int left = 0, right = len - 1, maxLeft = 0, maxRight = 0, total = 0;
        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] > maxLeft){
                    maxLeft = height[left];
                }
                else{
                    total += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right] > maxRight){
                    maxRight = height[right];
                }
                else{
                    total += maxRight - height[right];
                }
                right--;
            }
        }



        return total;
    }
}
