// Time Complexity : O(N)
// Space Complexity : O(1)

class Solution {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        return maxProfit;
    }
}

/**
 * Variation: On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 */

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit+=prices[i] - min;
                min = prices[i];
            }
        }
        return profit;
    }
}