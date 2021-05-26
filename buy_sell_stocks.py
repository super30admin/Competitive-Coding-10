# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not len(prices):
            return 0
        n = len(prices)
        top = prices[0]
        bottom = prices[0]
        i = 0
        pro = 0
        while i < n - 1:
            while i < n - 1and prices[i] >= prices[i + 1]:
                i+=1
            bottom = prices[i]
            while i < n - 1 and prices[i] <= prices[i + 1]:
                i += 1
            top = prices[i]
            pro += top - bottom
        return pro