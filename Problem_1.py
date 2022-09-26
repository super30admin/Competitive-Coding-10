"""
122. Best Time to Buy and Sell Stock II

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

"""

# Approach -1 Brute Force

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        for loop based recursion, considering every elements in the array.
        TC: O(n^n)
        SC: O(n)
        """
        def helper(prices, idx):
            # Base Condition
            if idx >= len(prices):
                return 0
            max_profit = 0
            for i in range(idx, len(prices)):
                profit = 0
                
                for j in range(i + 1, len(prices)):
                    if prices[j] > prices[i]:
                        p = helper(prices, j + 1)  + prices[j] - prices[i]
                        
                        if p > profit:
                            profit  = p
                            
                if profit > max_profit:
                    max_profit = profit
                    
            return max_profit
        
        return helper(prices, 0)

# Approach - 2 Optimized Solution
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        peak- valley method
        TC: O(n)
        SC: O(1)
        """
        max_profit = 0
        
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                p = prices[i] - prices[i - 1]
                max_profit += p
                
        return max_profit
