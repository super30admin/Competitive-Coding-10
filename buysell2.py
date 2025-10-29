# Time Complexity : O(N) where N is the length of the prices list
# Space Complexity : O(1) as we are using only a constant amount of extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am iterating through the prices list and checking if the next day's price is higher than the current day's price
# If it is, I calculate the profit by subtracting the current day's price from the next day's price and add it to the total profit
# This way, I am effectively capturing all the upward trends in the stock prices to maximize profit. As we are allowed to make multiple transactions, this approach works well.

from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        profit = 0
        for i in range(n-1):
            if prices[i] < prices[i+1]:
                selling = prices[i+1] - prices[i]
                profit += selling
        return profit
