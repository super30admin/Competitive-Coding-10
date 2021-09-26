"""
Time Complexity : O(n) number of elements in prices array
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        smaller = prices[0]
        larger = prices[0]
        i = 0
        # We traverse through the prices and when ever we find a smaller element we
        # store the consecutive smaller and larger element in two variables
        # smaller and larger. We do it till for a particular smaller prices we find
        # the larger price. After that we just take the difference of larger and 
        # smaller element and add it to the maxProfit
        while i < len(prices) - 1:
            while i < len(prices) - 1 and prices[i] >= prices[i + 1]:
                i += 1
            smaller = prices[i]
            while i < len(prices) - 1 and prices[i] <= prices[i + 1]:
                i += 1
            larger = prices[i]
            maxProfit += larger - smaller
        return maxProfit