// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        while (i + 1 < prices.length) {
            if (prices[i + 1] > prices[i]) {
                max = max + prices[i + 1] - prices[i];
            }
            i++;
        }
        return max;
    }
}