class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        #one pass
        #O(n)
        #O(1)
        """"
         In this case, instead of looking for every peak following a valley, we can simply go on crawling over the slope and keep on adding the profit obtained from every consecutive transaction.
        """
        maxprofit=0
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                maxprofit+=prices[i]-prices[i-1]
        return maxprofit
        