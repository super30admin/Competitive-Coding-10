# Created by Aashish Adhikari at 5:29 PM 3/1/2021

'''
Time Complexity:
O(n) since we traverse the list only once.

Space Complexity:
O(1)

'''


class Solution(object):

    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """

        if len(prices) == 0 or len(prices) == 1:
            return 0

        BUY = 0
        SELL = 1

        total_profit = 0
        CURRENT = BUY

        while SELL < len(prices):

            if prices[SELL] >= prices[CURRENT]:

                SELL += 1
                CURRENT += 1

                if SELL == len(prices):

                    total_profit += (prices[SELL-1] - prices[BUY])


            else:

                total_profit += (prices[SELL-1] - prices[BUY])

                BUY = SELL
                SELL = BUY + 1
                CURRENT = BUY

        return total_profit