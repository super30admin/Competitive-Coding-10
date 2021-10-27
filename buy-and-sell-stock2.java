//Time complexity: O(N)
//Space complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int max_profit = 0;
        for(int i = 1; i < prices.length; i++) {
            //if price at current day is greater than previous, we will sell the stock
            if(prices[i] > prices[i-1]) {
                max_profit = max_profit + (prices[i] - prices[i-1]);
            }
        }
        return max_profit;
    }
}