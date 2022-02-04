class Solution:
    # Time Complexity - O(n)
    # Space Complexity - O(1)
    def maxProfit(self, prices) -> int:
        i = 0
        buy, sell, profit = 0, 0, 0
        n = len(prices) - 1

        while i < n:
            while i < n and prices[i + 1] <= prices[i]:
                i += 1

            buy = prices[i]

            while i < n and prices[i + 1] > prices[i]:
                i += 1

            sell = prices[i]

            profit += sell - buy
        return profit