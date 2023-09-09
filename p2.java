// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

//Calculating profit every time the slope is increasing
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                profit = profit + prices[i+1] - prices[i];
            }
        }

        return profit;
    }
}