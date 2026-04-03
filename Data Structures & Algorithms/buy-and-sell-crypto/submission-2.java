class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=0;
        int sell=1;
        int maxprofit=0;
        int profit=0;
        while(sell<prices.length){
            profit=prices[sell]-prices[minbuy];
            if(profit>maxprofit){
                maxprofit=profit;
            }
            if(prices[sell]<prices[minbuy]){
                minbuy=sell;
            }
            sell++;
        }
        return maxprofit;
    }
}