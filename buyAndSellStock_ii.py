#O(n) time and O(1) solution
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        left = 0
        right = left + 1
        n = len(prices) - 1
        #this is to avoid repeated profit calculation
        i = 0
        while i < n:
           
            while(i < n and prices[i+1] <= prices[i]):
                i += 1
            left = prices[i]
            while(i < n and prices[i + 1] > prices[i]):
                i += 1
            right = prices[i]
            profit += right - left
        
        return profit