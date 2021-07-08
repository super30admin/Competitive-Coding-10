// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We basically buy all all the dips and hold it until the stock price keeps rising.
*/

class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if (prices[i-1]<prices[i])
                profit += prices[i]-prices[i-1];
            
        }
        return profit;
    }
}