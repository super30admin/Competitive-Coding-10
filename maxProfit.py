# TimeComplexity:O(n)
# SpaceComplexity:O(1)
# Approach:
# #every increse in stock price will contribute to our profit, if curr price is greater than prev price buy at prev prioce and sel l at cuur price






class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        for i in range(1,len(prices)):
            # prices = [7,1,5,3,6,4]
            if prices[i]>prices[i-1]:
                profit+= prices[i]-prices[i-1]
        return profit

        """
        [7,1,5,3,6,4]
        idx=2
        profit=4+3
        """


