// Time Complexity : O(n) where n is the number of prices
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * If there is an increase in price, we can sell the stock rightaway and buy it again. That way, the final profit will be same as the net gain.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }

        return maxProfit;
    }
}