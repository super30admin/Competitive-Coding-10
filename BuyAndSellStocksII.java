/*
Time: O(N)
Space: O(1)
Approach:
========
1. Calculate difference between consecutive stock prices and add to profit if next - curr is greater than 0
2. This gives max profit that can be derived
*/
class Solution {
    public int maxProfit(int[] prices) {
        int rec_max = 0;
        for(int i = 1; i < prices.length; i++) {
        	//check consecutive elements difference and update current maximum 
            int curr_max = Math.max(0,prices[i]-prices[i-1]);
            // add current maximum to total maximum profit
            rec_max += curr_max; 
        }
        return rec_max;
    }
}