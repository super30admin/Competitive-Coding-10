# 122. Best Time to Buy and Sell Stock II
# https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

# Logic: We will have a running min value. We iterate over the input. 
# We check if the current element is less than min value, then we 
# update min value and have the same profit as the previous day. Else 
# the profit will be profit from the previous day plus todays price 
# minus min value.

# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        dp = [0 for _ in range(n)]
        
        min_val = prices[0]
        
        for i in range(1,n):
            if prices[i] < min_val:
                min_val = prices[i]
                dp[i] += dp[i-1]
            else:
                dp[i] = dp[i-1] + prices[i] - min_val
                min_val = prices[i]
        
        return dp[n-1]