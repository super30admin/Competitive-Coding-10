#TC - O(N)
#SC - O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)==0:
            return 0
        mp = 0
        n = len(prices)
        for i in range(0,n-1):
            if prices[i]<prices[i+1]:
                mp+=prices[i+1]-prices[i]
        
        return mp