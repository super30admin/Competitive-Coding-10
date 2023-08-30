# Time complexity - O(N)
#  Space complexity - O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        s=0
        for i in range(0,len(prices)-1):
            if prices[i]<prices[i+1]:
                s+=prices[i+1]-prices[i]
        return s  