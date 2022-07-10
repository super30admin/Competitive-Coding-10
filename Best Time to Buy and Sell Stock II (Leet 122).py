'''
Time: O(n)
Space: O(1)
'''

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices is None or len(prices) == 0:
            return
        maxP = 0
        b,s = 0,1
        
        while s < len(prices):
            
            buy = prices[b]
            sell = prices[s]
            
            if sell >= buy:
                maxP += sell - buy
                b += 1
            
            else:
                b = s
            s+=1
        return maxP
            
        