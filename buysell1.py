# TC==>O(n)
# Sc==>O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left=0
        right=1
        mprofit=0
        while right < len(prices):
            if prices[left] < prices[right]:
                val=prices[right]-prices[left]
                mprofit=max(val,mprofit)
            else:
                left=right
            right=right+1
        
        return mprofit