// Time Complexity :  O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        if(prices == null || prices.length == 0){
            return res;
        }
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }
}