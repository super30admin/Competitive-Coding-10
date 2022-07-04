//Time: O(N) | Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length-1;i++) {
            // only current day's stock is lesser than stock price of tomorrow,
            // we will buy today and sell tomorrow and make a profit out of it
            if(prices[i]<prices[i+1]) {
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}