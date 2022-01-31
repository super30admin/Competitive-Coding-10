class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0; //if the prices array is null or the length of the prices is 0 we return 0;
        int profit = 0; //we initialize an integer variable with name profit
        for(int i = 1; i < prices.length; i++) { //we start iterating from i = 1 until the length of the array of prices
            if(prices[i] > prices[i - 1]) { //if the price of stock at i is greater than the price of stock at i - 1
                profit += prices[i] - prices[i - 1]; // we add the difference to the profit variable
            }
        }
        return profit; // in the end, we return the profit.
    }
}
//tc and sc - O(n) and O(1)