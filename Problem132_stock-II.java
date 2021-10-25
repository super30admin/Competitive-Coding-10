// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxCur = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, prices[i] - prices[i - 1]);
            profit += maxCur;
        }
        return profit;
    }
}