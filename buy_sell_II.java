// Time Complexity :O(n )
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {
        int i, profit = 0, min = Integer.MAX_VALUE;
        
        int n =prices.length;
        for(i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else if(prices[i]-min > 0){
                profit += prices[i]-min;
                min= prices[i];
            }
        }
        return profit;
    }
}