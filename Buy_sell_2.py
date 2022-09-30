# Time complexity : O(n)
# Space complexityy : O(1)
# Leetcode : Solved and submitted

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices) - 1
        profit = 0
        valley = peak = prices[0]
        i = 0
        
        # traverse over the array
        while i < n:
           # find the valley which price doing down, which is the least price
            while i < n and prices[i] >= prices[i+1]:
                i += 1
            valley = prices[i]
            
            # find the highest price going ahead
            while i < n and prices[i] <= prices[i+1]:
                i += 1
            peak = prices[i]
            
            # fetch the profit
            profit += peak - valley
        
        return profit
