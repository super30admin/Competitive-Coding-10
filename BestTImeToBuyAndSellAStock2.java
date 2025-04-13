// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, start from 0th position to length-1 and whenever price at ith position is greaterthan or equal to i+1th position just continue else
 * take prices at i+1th position -price at ith position to maxprofit. Finally, return maxprofit.
 */

public class BestTImeToBuyAndSellAStock2 {

    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }

        }

        return profit;
    }
}
