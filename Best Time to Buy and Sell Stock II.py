# time complexity is o(n), where n is the size of the input
# space complexity is o(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        res = 0
        for i in range(len(prices)-1):
            if(prices[i] < prices[i+1]):
                res += prices[i+1] - prices[i]
        return res
       