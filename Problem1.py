#122 Best time to buy and sell stock 2
# Time - O(n)
# space - O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        profit = 0
        
        for i in range(1, len(prices)):
            
            if prices[i] > prices[i - 1]:
                
                netprofit = prices[i] - prices[i - 1]
                profit = profit + netprofit
        
        return profit