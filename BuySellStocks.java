// Time Complexity : O(n) where n is the number of prices in the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Peak and Valley logic didnt strike but why it is giving "Guaranteed" solution? I was thinking along the lines of minimum Cost Price and max Selling Price.
/* Your code here along with comments explaining your approach: We have to deal with multiple transactions here which can give us the max. So the idea
is based on getting the stock at a cheap price and as soon as the price starts dropping, just before that sell it, and buy it again as price drops
similar to market behaviour. Buying the stock at cheaper price at different instances is valley of the array and selling it at higher price is peak at different instances.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int diff  = 0,i=0;
        if(prices == null || prices.length == 0){return 0;}                                                 // edge case
        while(i < prices.length-1){
            while(i < prices.length-1 && prices[i] >= prices[i+1])                                                      // Find Valley
                i++;
            int valley = prices[i];
            while(i < prices.length-1 && prices[i] <=  prices[i+1])                                     // Find Peak
                i++;
            int peak = prices[i];
            diff += peak - valley;                                                                      // Profit Earned at different instances
        }
        return diff;
    }
}