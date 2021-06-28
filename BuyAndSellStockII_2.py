# TC : O(N) as we iterate over all element of prices array.
# SC: O(1) since we do not use any extra space.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        
        for i in range(1, len(prices)): 
            if prices[i] > prices[i - 1]: 
                max_profit += prices[i] - prices[i - 1]
        
        return max_profit
        
