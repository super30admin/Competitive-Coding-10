# Time Complexity : O(n)
# Space Complexity : O(1)
# Approach:
#     for each day until the second last day check if the next day has a value higher
#     if it does then make that transaction. 
#     you are accumulating profits because you are checking on each day.
#     so if the situation is [1, 2, 3, 0, 6] then adding 3 - 2  to profit is like buying at 1 and selling at 3

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if(len(prices) == 0):
            return 0
        
        profit = 0
        
        for i in range(len(prices)-1):
            if(prices[i+1] > prices[i]):
                profit += prices[i+1] - prices[i]
        
        return profit