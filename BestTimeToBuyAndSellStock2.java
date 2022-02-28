//time complexity : O(n)
//space complexity : O(1)
//approach: everytime the price is less than the current buy, we buy the stock
//and add the curr profit to our result, else we check whether if we sell that day,
//the profit will be greater than the current profit.
class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int profit = 0;
        int multi_profit = 0;

        for(int i = 1; i< prices.length; i++){
            if(prices[i] < prices[buy] || prices[i] - prices[buy] < profit){
                buy = i;
                multi_profit = multi_profit + profit;
                profit = 0;
            }
            else{
                profit = Math.max(profit,prices[i] - prices[buy]);
            }

        }

        return profit + multi_profit;
    }
}
