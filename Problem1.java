// Time Complexity : O(n) where n is the size of prices array
// Space Complexity : O(1) constant space as we do not use any additional space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public int maxProfit(int[] prices) {
        //base case
        if(prices == null || prices.length == 0){
            return 0;
        }

        int totalProfit = 0;
        for(int i = 0; i < prices.length-1; i++){

            if(prices[i+1] - prices[i] > 0){
                totalProfit += prices[i+1] - prices[i];
            }
        }

        return totalProfit;
    }
}
