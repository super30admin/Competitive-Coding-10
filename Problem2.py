'''
Time Complexity: O(n) where n is length of prices
Space Complexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        n = len(prices)
        if n == 1:
            return 0
        result = 0
        for idx in range(1,n):
            if prices[idx-1] < prices[idx]:
                result += prices[idx] - prices[idx - 1]
        return result
        