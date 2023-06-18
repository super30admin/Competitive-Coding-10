// TC - O(n)
// SC - O(1)

// Approach
// We iterate through the stock prices and add to the max profit only if the
// delta between 2 days is positive. 

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;
        for(int i=1; i<prices.length; i++) { // start on second day
            // add profit only if its positive for a day
            profit += Math.max(0, prices[i]-prices[i-1]); 
        }

        return profit;
    }
}