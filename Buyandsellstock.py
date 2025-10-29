class Solution(object):
    # tc : O(n), # sc : O(1)
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        # appraoch : dp check buying today and selling the other day and so on and see the exhaustively check both buying r not busyign that day 
        # better approach : peak valley approach 
        # lets take a test case [1,5,6] the profit is bought on 1st day 5-1, 6-5 = 4+1 = 5
        #or bought on 1st day and sold on 3rd day 6-1 = 5 again
        # so the profit is basically if the next day is greater than than curr day then we get the profit there and if we apply this logic till the end of the arr we get our profit
        # its like by the first day and sell the last most profitabel day to get the proit and in betwen buy and sell + busy and sell and so on.. gives us the same output

        max_profit = 0
        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                max_profit += prices[i] - prices[i-1]
        
        return max_profit