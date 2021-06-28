# TC: O(N) since we are iterating over all the elements of the prices array exactly once. 
# SC: O(1) as we do not need any extra space.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices or len(prices) == 0: 
            return 0 
        
        n = len(prices)
        peak = prices[0]
        valley = prices[0]
        max_profit = 0
        
        i = 0
        while i < n - 1: 
#             finding the valley first
            while i < n - 1 and prices[i] >= prices[i + 1]: 
                i += 1
            valley = prices[i]
#             finding the next peak element
            while i < n - 1 and prices[i] <= prices[i + 1]: 
                i += 1
            peak = prices[i]
            
            max_profit += (peak - valley)
        
        return max_profit
