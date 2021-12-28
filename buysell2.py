# TC==>O(n)
# Sc==>O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mprofit=0
        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                mprofit+=(prices[i]-prices[i-1])
        return mprofit