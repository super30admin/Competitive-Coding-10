// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class buyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        int profit = 0;
        int min = prices[0];
        int n = prices.length;

        
        for(int i = 1; i < n; i++) {
            min = Math.min(prices[i], min);
            profit = Math.max(prices[i] - min, profit);
        }
        
        return profit;
    }
    
}
