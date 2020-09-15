#Problem 1:https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
#Test Cases passed on Leetcode 
#Time Complexity:    O(N)
#Space Complexity:   O(1)
#Approach1: Keep on adding the profit obtained from every consecutive transaction and if it is not profit, simply add 0 
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
       
        profitTillIndex=0
        for i in range(1, len(prices)):
            profitTillIndex = profitTillIndex + ( max(prices[i] - prices[i - 1], 0) ) 

        return profitTillIndex
#Approach2:Find low points and high points in the slope created by price array.
#buy at lower price and sell at high price

class Solution:
	 def maxProfit(self, prices: List[int]) -> int:
	        buy=prices[0]
	        max_profit=0
	        for i in range(1,len(prices)):
	        	#identify the price which is lower than the previous one, which means
	        	#we need to sell at previous price and buy it at current price
	            if prices[i]<prices[i-1]:
	                sell=prices[i-1]
	                profit=sell-buy
	                max_profit+=profit
	                buy=prices[i]
	        #[1,2,3,4,5]
	        #buy at 1 and sell at 5 ->since by above algo we would never get a price
	        #which is lower than previous one , so we need to include the below line

	        max_profit+=prices[len(prices)-1]-buy
	        return max_profit
