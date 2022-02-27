"""
You are given an integer array prices where prices[i] 
is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold 
at most one share of the stock at any time. However, you can buy it then 
immediately sell it on the same day.

Find and return the maximum profit you can achieve.

"""

# Time Complexity : O(n) since we iterate over all values of iterator once
# Space Complexity : O(1) since we use only a variable and not storing any values
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max1 = 0
        buy = 0
        sell = 0
        i = 0
        n = len(prices)
        
        if not n:
            return 0
        
        # as long as we havent reached the end of the list 
        while i < n-1:
            
            # as long as we still have not reached the end of list and current price is greater than 
            # next price (means we need to sell), update sell variable
            while (i < len(prices) - 1 and prices[i] >= prices[i + 1]):
                i += 1
            sell = prices[i]
            
            # as long as we still have not reached the end of list and current price is smaller than 
            # next price (means we need to buy), update buy variable
            while (i < len(prices) - 1 and prices[i] <= prices[i + 1]):
                i += 1
            buy = prices[i];
            
            # for every pair of i and i+1, we need to calulate profit. Hence update profit with (buy - sell). 
            # Keep adding this profit at each new iteration
            max1 += buy - sell;
        
        return max1;
                    
            
            
        