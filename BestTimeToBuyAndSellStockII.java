// Time Complexity : O(n), n-prices array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// Loop through each day and check if the price increases from the previous day.
// If it does, add the profit to the total, this makes buying and selling daily on uptrends.
// The total profit is the sum of all profitable transactions.

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}