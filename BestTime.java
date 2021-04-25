// Time Complexity : O(n) n - length of prices array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Adding just the increasing profits

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                max += prices[i+1]-prices[i];
            }
        }
        return max;
    }
}
