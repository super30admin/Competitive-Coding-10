    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    Time Complexity for operators : o(n) .. n is the length of the string
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. 
                    A) Traverse through the prices array.
                    B) Calculate the difference betweeen the next and previous days stock.
                    C) if that difference is greater than Zero then add to the profit.
                    D) Return the profit.
    */  

class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0,profit=0;;
        for(int i=0;i<prices.length-1;i++)
        {
            diff = prices[i+1]-prices[i];
            if(diff>0)
               profit = profit + diff;
        }
        
        return profit;
    }
}