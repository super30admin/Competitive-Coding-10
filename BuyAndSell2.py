# Time Complexity : O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) <= 1:
            return 0 
        profit = 0 
        i = 0 
        while i < len(prices):
            
            while i < len(prices)-1 and prices[i+1] <= prices[i]:
                i += 1 
            min_ = prices[i]
            i += 1 
            
            while i < len(prices)-1 and prices[i+1] >= prices[i]:
                i+= 1 
            
            if i < len(prices):
                profit += prices[i] - min_
                i += 1 
        
        return profit