// TimeComplexity: O(n)
// SpaceComplexity: O(1)
// Explanation: I am solving the problem by adding all positive price differences between consecutive days. If the price on the next day is higher than the current day, I add the difference to the total profit because it represents a valid buy and sell opportunity. This approach works because multiple small profitable transactions are equivalent to one larger transaction in terms of total profit.

class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int i=0; i<prices.length-1; i++) {
            if(prices[i]<prices[i+1]) {
                profit = profit + prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}