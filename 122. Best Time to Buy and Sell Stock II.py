#space: O(1)
#time:: O(n)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) <= 1:
            return 0
        n = len(prices)
        total=0
        r= 1
        while r <= n-1:
            if prices[r] > prices[r-1]:
                total += prices[r] - prices[r-1]
            r = r+1
        return total
