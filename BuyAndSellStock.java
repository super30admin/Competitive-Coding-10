// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // we'll consider maxima if we have any and add that in profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }

        }
        return maxProfit;
    }
}