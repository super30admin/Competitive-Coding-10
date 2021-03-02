#Time Complexity -- O(n)
#Space Complexity --O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        if not prices:
            return 0
    
        profit = 0
        buy = prices[0]

        for i in range(1, len(prices)):
            curr = prices[i]
            if curr - buy > 0:
                profit += curr - buy

            buy = curr

        return profit
