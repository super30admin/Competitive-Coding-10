# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# Approach:
#Since we can buy multiple stocks at the same time, we can simply calculate a running profit of every time there is an increasing difference in the stock prices to earn maximum profit

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max_profit = 0
        
        for i in range(1, len(prices)):
            if prices[i]>prices[i-1]:
                max_profit += prices[i]-prices[i-1]
        
        return max_profit