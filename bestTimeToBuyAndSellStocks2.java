//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this : no

class Solution {
    public int maxProfit(int[] prices) {
        
        
           if(prices.length == 0){
            
            return 0;
        }
        
         int min = prices[0];
		 int profit = 0;
		 
		 for(int i = 1; i < prices.length; i ++) {
			 
			min = Math.min(min, prices[i]);
			 if(prices[i] > min){
                 
                 profit = profit + prices[i] - min;
                 min = prices[i];
             }
			// int temp = prices[i] - min;
			 
			// profit = Math.max(temp, profit);
		 }
		return profit;
    }
}