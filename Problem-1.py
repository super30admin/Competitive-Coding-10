"""
Approach 1: Compare consecutive prices
Sell everytime you make a profit

TC: O(n)
SC: O(1)

"""
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        if not prices:
            return max_profit
        min_price = prices[0]
        
        for i in range(1, len(prices)):
            profit = prices[i] - prices[i-1] 
            if profit > 0:
                max_profit +=  profit
        return max_profit