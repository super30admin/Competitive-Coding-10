/*
122. Best Time to Buy and Sell Stock II
Ran on leetcode: Yes
TC: O(n)
SC: O(1)
Iterate through the list and add up all the upward slopes, to get the max profit
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i - 1] < prices[i]){ // Check if it is a upward
                maxProfit += prices[i] - prices[i - 1]; // Take the profit and add it to maxProfit
            }
        }
        return maxProfit;
    }
}