#Time Complexity : O(n) where n is the length of prices
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes


class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                max_profit += prices[i]-prices[i-1]

        return max_profit
