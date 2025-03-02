public class _605_CanPlaceFlower {
    public static void main(String[] args) {
        int[] pot = {0, 1, 0, 0, 0, 1 ,1};
        int n = 2;
        System.out.println(canPlaceFlower(pot, n));
        
    }

    static boolean canPlaceFlower(int[] pot, int n){
        
        int len = pot.length;
        int count = 0;
        for (int i = 0 ; i < len; i++){
            if(pot[i] == 0){
                if((i == 0 || pot[i - 1] == 0) && (i == len - 1 || pot[i + 1] == 0)){
                    pot[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}
