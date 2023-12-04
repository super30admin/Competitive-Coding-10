// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class BestTimeToBuyAndSellStockTwo {
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int result = 0;

            if(n == 0)
                return result;

            int buy = prices[0];
            for(int  price : prices){
                if(price > buy){
                    result += price - buy;
                }
                buy = price;
            }
            return result;
        }
    }
}
