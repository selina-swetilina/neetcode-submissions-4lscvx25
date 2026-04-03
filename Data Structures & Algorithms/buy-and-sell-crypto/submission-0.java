class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[buy]>profit){
                profit=prices[i]-prices[buy];
            }
            if(prices[buy]>prices[i]){
                buy=i;
            }
        }
        return profit;
    }
}