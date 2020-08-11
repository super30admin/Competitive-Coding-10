
---------------------------------------Best time to buy and sell stock------------------------------------------
# Time Complexity : O(N) as N is the length of elements we can take 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here as we need to check the lowest buying price and highest selling price, we will iterate through array and 
# check if the current ele is less than buying price. If it is then we will update buying price , else we will
# check the profit and calculate the maximum profit.

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        
        bp = prices[0]
        max_profit = 0
        
        for i in range(1, len(prices)):
            if prices[i]<bp:
                bp = prices[i]
            else:
                max_profit = max(max_profit, prices[i]-bp)
        
        return max_profit
        
        
---------------------------------------Best time to buy and sell stock II------------------------------------------
# Time Complexity : O(N) as N is the length of elements we can take 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here as we need to check the lowest buying price and current ele as  selling price if it is greater then the buyng price
#we will calculate the profit and add to the resultant element. As we can do many transactions, we will add 
# all the differences.
        
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        
        max_profit = 0

        for i in range(1, len(prices)):
            if prices[i]>prices[i-1]:
                max_profit += prices[i]-prices[i-1]
        return max_profit