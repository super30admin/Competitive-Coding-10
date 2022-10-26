// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                profit+=prices[i] - min;
                min = prices[i];
            }
        }
        return profit;
    }
}