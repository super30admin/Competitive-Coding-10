// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
    1. Keep looping through the array till the end of the array.
    2. If the current element is greater than the previous element, then add the difference to the result variable
*/

// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        if(len == 0 || len == 1) return 0;
        for(int i=1;i<len;i++) {
            if(prices[i] > prices[i-1])
                profit += (prices[i] - prices[i-1]); 
        }
        return profit;
    }
}
