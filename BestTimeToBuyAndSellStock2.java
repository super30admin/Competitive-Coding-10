// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        for(int i = 0; i < n-1; i++){
            if(prices[i] > prices[i+1]){
                continue;
            } else {
                maxProfit += prices[i+1] - prices[i];
            }
        }

        return maxProfit;
    }
}
