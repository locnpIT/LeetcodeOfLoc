public class _202_HappyNumber {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));

    }

    static boolean isHappy(int n){
        int fast = n, slow = n;
        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));

        }while(fast != slow);

        return slow == 1;
    }

    static int digitSquareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }


}
