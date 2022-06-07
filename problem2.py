#Buy and sell stocks ii
# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy=float('inf')
        dp=[0]*(len(prices)+1)
        
        for i in range(1, len(dp)):
            if(prices[i-1]<buy):                            #if the current stock value is less than previous buy, then set buy to the current one
                buy=prices[i-1]
                dp[i] = dp[i-1]                                #the profit should be the same as previous array
            else:
                dp[i] = dp[i-1]+(prices[i-1]-buy)           #if current stock is greater, then sell it and also set the buy as the current price
                buy = prices[i-1]
        return dp[-1]