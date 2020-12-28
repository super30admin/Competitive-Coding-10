# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        # We can buy whenever the price on a preceeding day is less than the price on a given day
        # Greedily buy and sell whenever this condition is met
        for i in range(1, len(prices)):
            if prices[i-1] < prices[i]:
                profit += prices[i] - prices[i-1] 
                
        return profit