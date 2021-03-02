# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using peak and valley approach
# Iterate over the prices array starting from 1 and check if the current price is greater than the previous price then add difference to profit
# Return the cumulative profit


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return None
        profit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                profit += prices[i] - prices[i - 1]
        return profit