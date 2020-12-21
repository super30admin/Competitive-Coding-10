"""
Time complexity 0(N)
SC O(1)

"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        n=len(prices)
        profit=0
        for i in range(n):
            if(i<n-1 and prices[i]<prices[i+1] ):
                diff=prices[i+1]-prices[i]
                profit+=diff
                
        return profit
        