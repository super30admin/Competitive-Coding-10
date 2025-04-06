# Time O(n)
# Space O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        peak = prices[0]
        valley = prices[0]
        maxP = 0
        n = len(prices)
        while i < n-1:
            while i < n-1 and prices[i] >= prices[i+1]:
                i += 1
            valley = prices[i]
            while i < n-1 and prices[i] <= prices[i+1]:
                i += 1
            peak = prices[i]
            maxP += peak - valley
        return maxP