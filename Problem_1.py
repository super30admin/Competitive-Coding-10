from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices == None or len(prices) == 0:
            return 0
        maxProfit = 0
        # for i in range(1,len(prices)):
        #     if prices[i] >= prices[i-1]:
        #         maxProfit += prices[i] - prices[i-1]
        peak = prices[0]
        valley = prices[0]
        i = 0
        while i < len(prices) - 1:
            while i < len(prices) - 1 and prices[i] >= prices[i+1]:
                i += 1
            valley = prices[i]
            while i < len(prices) - 1 and prices[i] <= prices[i+1]:
                i += 1
            peak = prices[i]
            maxProfit += peak - valley
        return maxProfit

# Time Complexity: O(n)
# Space Complexity: O(1)
# Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/