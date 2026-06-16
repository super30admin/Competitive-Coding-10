// Time Complexity : O(n) because we traverse the array once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We greedily capture every increasing price difference as profit.
// Any continuous upward trend can be split into multiple buy-sell transactions without changing the total profit.
// Adding all positive differences gives the maximum possible profit.

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            // take profit from every upward move
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}