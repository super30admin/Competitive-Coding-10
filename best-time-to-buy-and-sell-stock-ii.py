'''
TC: O(n)
SC: O(1)

Intuition:

- At any point of time, imagine we are buying the stock, sell it greedily if a greater price is found
- Update CP

'''
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if not prices:
            return 0
        
        
        profit = 0
        cp = prices[0]
        
        for i in range(1, len(prices)):
            if prices[i] > cp:
                profit += prices[i] - cp
            cp = prices[i]
        
        return profit
        