# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices or len(prices) == 0:
            return 0

        max_profit = 0

        for i in range(1, len(prices)):
            profit = prices[i] - prices[i - 1]
            if profit > 0:
                max_profit += profit

        return max_profit