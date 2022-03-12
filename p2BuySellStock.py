"""
time: O(N)
space: O(1)

"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        priceLen = len(prices)
        
        for val in range(1, priceLen):
            if prices[val] > prices[val-1]:
                res +=  prices[val] - prices[val-1]
        #1,2,3,4,5
        
        return res
        