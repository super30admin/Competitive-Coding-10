// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return -1;

        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            buy = Math.min(buy, prices[i]-profit);
            profit = Math.max(profit, prices[i] - buy);

        }

        return profit;
    }
}

