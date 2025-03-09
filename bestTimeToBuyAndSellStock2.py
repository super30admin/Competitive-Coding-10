class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # T: O(n), S: O(1)
        res = 0

        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                res += prices[i] - prices[i - 1]

        return res
