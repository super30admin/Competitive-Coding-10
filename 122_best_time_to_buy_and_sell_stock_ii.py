"""
Leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

Approach 1: If the price on day 2 is greater than the price of day 1, buy the day 1 and
sell on day 2 to get that profit, and do it for all the stocks to get the maximum profit.
Time Complexity: O(N), N is the length of given array
Space Complexity: O(1)
"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxprofit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                maxprofit += prices[i] - prices[i-1]

        return maxprofit


# Approach 2: Peak Valley Approach, same logic as approach 1
# Time Complexity: O(N), N is the length of given array
# Space Complexity: O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        maxprofit = 0
        while i < len(prices) - 1:
            while i < len(prices) - 1 and prices[i] >= prices[i + 1]:
                i += 1
            valley = prices[i]

            while i < len(prices) - 1 and prices[i] <= prices[i + 1]:
                i += 1
            peak = prices[i]
            maxprofit += peak - valley
        return maxprofit
