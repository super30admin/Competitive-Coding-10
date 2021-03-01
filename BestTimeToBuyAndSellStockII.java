// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class BestTimeToBuyAndSellStockII {
    //compare ith price to the ith+1 price and if ith+1 price is greater than ith price then make transaction for profit
    class Solution {
        public int maxProfit(int[] prices) {
           if(prices==null||prices.length==0) return 0;//edge case

            int profit=0;
            //make purchase when prices[i+1]> prices[i]
            for (int i = 0; i < prices.length-1; i++) {
                if(prices[i+1]>prices[i]){
                    profit += prices[i+1]-prices[i];
                }
            }
            return profit;
        }
    }
}