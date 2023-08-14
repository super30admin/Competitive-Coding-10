//O(n)
//O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int profit = 0;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - minPrice;
             profit = Math.max(profit, cost);
            minPrice = Math.min(minPrice, prices[i]);
            
        }
            
        return profit;
    }
}
