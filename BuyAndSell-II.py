'''
Solution:
1.	The main idea is to sum up only positive slopes as profit 
	and when a negative slope => it is considered a 0 profit

Medium blog post explaining the same -> https://medium.com/algorithms-and-leetcode/best-time-to-buy-sell-stocks-on-leetcode-the-ultimate-guide-ce420259b323

Time Complexity:	O(N)	|	Space Complexity:	O(1)

--- Passed all testcases successfully on leetcode.
'''


class BuyAndSellII:
    def maxProfit(self, prices: List[int]) -> int:
        
        #	initializations
        profitTillIndex = 0
        
        #	sum up only positive slopes as profit and when a negative slope => it is considered a 0 profit
        for i in range(1, len(prices)):
            profitTillIndex = profitTillIndex + ( max(prices[i] - prices[i - 1], 0) )
            
        return profitTillIndex