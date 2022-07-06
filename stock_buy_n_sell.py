# Time Complexity : O(N) where N is number of prices given
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minBuy = prices[0]
        maxProfit = 0

        for i in range(1, len(prices)):
            if prices[i] < minBuy:
                minBuy =  prices[i]
            
            profit = prices[i] - minBuy
            maxProfit = max(maxProfit, profit) # 5

        return maxProfit