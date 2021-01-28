// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0) return 0;
        
        int profit = 0;
        
        int peak = prices[0];
        int valley = prices[0];
        
        int i = 0;
        
        while(i < prices.length - 1) {
            
            while(i < prices.length - 1 && prices[i] > prices[i + 1]) {
                i++;  
            }
            valley = prices[i];
            
            while(i < prices.length - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            
            profit += peak - valley;
        }
        
        return profit;
    }
    
}