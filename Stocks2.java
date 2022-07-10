/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        
        for(int i =0 ; i < prices.length -1; i++)
        {
            if(prices[i] < prices[i+1] )
            {
                profit += prices[i+1]-prices[i];
            }
        }
        
        
        return profit;
    }
}