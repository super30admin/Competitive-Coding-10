# Time Complexity : O(n)
# Space Complexity : O(1)

# The code ran on Leetcode

# Iterate over the array, at index i check it with value at index i-1. If it is greater, a profit can be made and record the profit in the result.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        res = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                res += prices[i] - prices[i-1]
        return res