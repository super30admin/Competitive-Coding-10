# TC:O(n)
# SC:O(1)
class Solution:
    def maxProfit(self, prices) :

        if prices == None or len(prices) == 0:
            return 0
        n = len(prices)
        profit = 0

        for i in range(n - 1):
            if prices[i + 1] > prices[i]:
                profit = profit + prices[i + 1] - prices[i]

        return profit