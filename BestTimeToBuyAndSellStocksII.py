"""
Approach:

If we analyze the graph, we notice that the points of interest are the consecutive valleys and peaks.

Mathematically speaking: Total Profit= sum((height(peak_i)-height(valley_i))

The key point is we need to consider every peak immediately following a valley to maximize the profit. In case we skip one of the peaks (trying to obtain more profit), we will end up losing the profit over one of the transactions leading to an overall lesser profit.

For example, in the above case, if we skip peak_i and valley_j trying to obtain more profit by considering points with more difference in heights, the net profit obtained will always be lesser than the one obtained by including them, since C will always be lesser than A+B.

TC: O(n)
SC: O(1)
"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        valley = prices[0]
        peak = prices[0]
        profit = 0
        n = len(prices)
        while i < n - 1:
            while i < n-1 and prices[i] >= prices[i+1]:
                i += 1
            valley = prices[i]
            while i < n-1 and prices[i] <= prices[i+1]:
                i += 1
            peak = prices[i]
            profit += peak - valley
            
        return profit
            
        