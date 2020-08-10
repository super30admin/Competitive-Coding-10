// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        
        int minPrice = prices[0], maxProfit = 0;
        
        for(int i=1; i<prices.length; i++) {
            
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            
            if(prices[i] > minPrice){
                int temp = prices[i] - minPrice;
                
                if(temp > maxProfit){
                    maxProfit = temp;
                }
            }
        }
        
        return maxProfit;
        
    }
}