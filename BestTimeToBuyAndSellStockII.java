package competitiveCoding10;

public class BestTimeToBuyAndSellStockII {
	//Time Complexity : O(n), where n is length of prices
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxProfit(int[] prices) {
        int profit = 0;
        
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }
        
        return profit;
    }
	
	//Time Complexity : O(n), where n is length of prices
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxProfit1(int[] prices) {
        int profit = 0;
        int max = Integer.MAX_VALUE;
        int min = max;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < max) {
                profit += max - min;
                max = prices[i];
                min = prices[i];
            } else {
                max = prices[i];
            }
        }
        
        profit += max - min;
        return profit;
    }
}
