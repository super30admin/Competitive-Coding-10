# Time O(n)
# Space O(1)
import math
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currMin = math.inf
        n = len(prices)
        maxProfit = -1
        for i in range(n):
            currMin = min(currMin, prices[i]) # 7 1 1 1 1 1
            maxProfit = max(maxProfit, prices[i] - currMin) # 0 0 4 4 5
        return maxProfit