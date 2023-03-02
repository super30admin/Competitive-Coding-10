// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Need to buy at valleys and sell at peaks

class Solution {
    public int maxProfit(int[] prices) {
        int valley = prices[0];
        int peak = prices[0];
        int maxProfit =0;
        int i=0;
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i]>=prices[i+1])
                i++;
            valley = prices[i];
            while(i<prices.length-1 && prices[i]<=prices[i+1])
                i++;
            peak = prices[i];
            maxProfit +=peak-valley;
        }
        return maxProfit;
    }
}