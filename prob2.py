# Time Complexity : O(n)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        profit = 0
        for i in range(n-1):
            if prices[i] >= prices[i+1]:
                continue
            else:
                profit += prices[i+1] - prices[i]

        return profit