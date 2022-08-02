#122. Best Time to Buy and Sell Stock II
"""
Time Complexity : O(n)
Space Complexity : O(1)
"""
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        buy = prices[i] #buy = 7
        profit = 0
        i = 1
        
        for i in range(1, len(prices)):
            if buy < prices[i]: #buy = 7    price[i]= 3
                profit = profit + (prices[i] - buy) # p = 4 + 2
                buy = prices[i] #buy = 7
            else:
                buy = prices[i] #buy = 7
                
        print(profit)
        return profit
