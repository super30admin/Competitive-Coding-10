# Best Time to Buy and Sell Stock II
# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit, i = 0, 1
        while i<len(prices):
            # If current price is greater than previous price, we can make a profit
            if prices[i]>prices[i-1]:
                profit+= prices[i] - prices[i-1]
            i+=1
        return profit

        