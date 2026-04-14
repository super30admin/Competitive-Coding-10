# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : We find every local valley (buy point) and every following peak (sell point).
# For each such valley-to-peak, we add the profit peak - valley to total.
# We repeat this until we reach the end of the prices list.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_p = 0
        i = 0

        n = len(prices)

        while i < n- 1:
            while i < n-1 and prices[i] >= prices[i+1]:
                i += 1
            low = prices[i]

            while i < n-1 and prices[i] <= prices[i+1]:
                i += 1
            high = prices[i]

            max_p += (high - low)

        return max_p

        