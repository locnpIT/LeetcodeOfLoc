public class _121_BestTimeToBuyAndSellStockI {
    public static void main(String[] args) {
        
        
    }

   
        public int maxProfit(int[] prices) {
            int mini=prices[0],profit=0;
            for(int i=1;i<prices.length;i++){
                profit=Math.max(profit,(prices[i]-mini));
                mini=Math.min(mini,prices[i]);
            }
            return profit;
        }
}
