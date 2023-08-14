#All TC passed on leetcode

class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        #Here we traverse the prices array and find the valley and peak and add their difference to profit.
        #Time complexity - O(n)
        #Space complexity - O(1)
        max_profit = 0
        valley = prices[0]
        peak = prices[0]

        i=0
        while i<len(prices)-1:
            while i<len(prices)-1 and prices[i]>=prices[i+1]:
                i+=1
            valley = prices[i]

            while i<len(prices)-1 and prices[i]<=prices[i+1]:
                i+=1
            peak = prices[i]

            max_profit += peak-valley
        return max_profit
        

#-------------------------------------OR--------------------------------------------

        max_profit = 0
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                max_profit += prices[i]-prices[i-1]
             
        return max_profit
        