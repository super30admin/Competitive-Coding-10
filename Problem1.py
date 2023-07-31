'''
Problem: Best Time to Buy and Sell Stock II
Time Complexity: O(n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        Traverse array and while traversing find the low val
        similarly find the high value
        and add high - low to the profit  
'''

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)-1
        profit = 0
        i = 0

        while i < n:
            while i < n and prices[i]>=prices[i+1]:
                i+=1
            minval = prices[i]
            while i < n and prices[i]<=prices[i+1]:
                i+=1
            maxval = prices[i] 
            profit+= maxval - minval   
        
        return profit
