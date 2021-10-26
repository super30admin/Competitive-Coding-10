// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class buyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for(int i = 1;  i < n; i++) {
            if(prices[i - 1] < prices[i])
                profit += prices[i] - prices[i -1];
        }
        
        return profit;
    }
}
