// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
If the incoming price is greater than the previous price, we append the difference of prices to the existing
profit. This way, we can maximize the total profit accumulated.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}