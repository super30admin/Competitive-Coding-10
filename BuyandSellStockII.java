/**
 * Approach: The idea is to sell the stock anytime the price goes higher than the buying price to earn max profit
 * compare current day price with the previous day price and if it is higher, than sell it and earn profit
 * TC: O(n) -> iterate through the prices array
 * SC: O(1) -> no additional space required
 */

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}