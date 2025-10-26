'''
Time: O(N)
Space: O(1)
'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        i = 0 # index

        while i < len(prices)-1:
            # find the valley
            while i<len(prices)-1 and prices[i]>=prices[i+1]: # uptil I find next element bigger than current
                i+=1
            valley = prices[i] 

            # find the peak
            while i<len(prices)-1 and prices[i]<=prices[i+1]: 
                i+=1
            peak = prices[i]

            maxProfit += peak-valley # update profit
        
        return maxProfit

        