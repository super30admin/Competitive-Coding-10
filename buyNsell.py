"""Buy and Sell II
Time Complexity - O(n)
Space Complexity - O(1)"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit = 0
        if prices is None and len(prices)==0:
            return maxprofit
        
        for i in range(len(prices)-1):
            if prices[i]<prices[i+1]: 
                maxprofit+=prices[i+1]-prices[i]
        return maxprofit
                
        