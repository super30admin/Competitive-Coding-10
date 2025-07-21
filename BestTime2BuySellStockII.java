// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


class BestTime2BuySellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] < prices[i]) result += (prices[i] - prices[i-1]);
        }
        return result;
    }
}