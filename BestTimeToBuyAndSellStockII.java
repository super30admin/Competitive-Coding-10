// Time Complexity : O(n) where n = length of prices array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//122. Best Time to Buy and Sell Stock II (Medium) - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution {
    public int maxProfit(int[] prices) {
        int peak = prices[0], valley = prices[0]; // 7
        int maxProfit = 0, i = 0;
        
        while (i < prices.length-1) {
            // increment the index till we get the min stock price
            while (i < prices.length-1 && prices[i] >= prices[i+1]) i++;
            valley = prices[i];
            
            // increment the index till we get the max stock price
            while (i < prices.length-1 && prices[i] <= prices[i+1]) i++;
            peak = prices[i];
            
            maxProfit += peak - valley;
        }
        
        return maxProfit;
    }
}