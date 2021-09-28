//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
/*
Time: O(n) where n = prices.length()
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {

        int result = 0;

        for (int i = 1; i < prices.length; i++)
            if (prices[i] > prices[i - 1])
                result += prices[i] - prices[i - 1];

        return result;

    }

}
