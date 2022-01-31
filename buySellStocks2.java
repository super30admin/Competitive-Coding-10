// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Use Greedy Approach
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) return 0;
        int n=prices.length, resultMax = 0;

        for (int i=1; i<n;i++) {
            if (prices[i] > prices[i-1]) {
                resultMax += (prices[i]-prices[i-1]);
            }
        }

        return resultMax;
    }
}