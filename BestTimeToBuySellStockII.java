// Time Complexity : O(N) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// maxProfit would be, sum of individual profits 
// buying stock the previous day and selling it today if price is higher 

class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        
        for(int i=1; i<prices.length; i++){
            sum += Math.max(0, prices[i] - prices[i-1]); 
        }
        
        return sum;
    }
}