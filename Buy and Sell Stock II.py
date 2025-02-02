#Time Complexity : O(N)
#Space Complexity : O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        maxprofit = 0
        for i in range(1,n):
            if(prices[i]>prices[i-1]):
                maxprofit += prices[i]-prices[i-1]
        return maxprofit