// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * For this problem, the cumulative profit will be the profit of each valley to peek.
 */

class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int total = 0;
        
        for(int i=1;i<prices.length;i++) {
            int cur_profit = prices[i] - bought;
            
            if(cur_profit > 0) {
                total += cur_profit;
                bought = prices[i];
            } else {
                bought = prices[i];
            }
        }
        
        return total;
    }
}
