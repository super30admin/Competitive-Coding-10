// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Grredy approach

class Solution {

    // This is a greedy approach and we don't need a DP approach
    public int maxProfit(int[] prices) {
        
        int profit = 0;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i - 1] < prices[i]) profit += prices[i] - prices[i - 1];
        }

        return profit;
    }
}