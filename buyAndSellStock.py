#Time: O(n)
#Space: O(1)
#Program ran on leetcode sucessfully

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices is None or len(prices) == 0:
            return 0
        
        start = 0
        currProfit = 0
        result = 0
        for i in range(len(prices)):
            profit = prices[i] - prices[start]
            if currProfit > profit:
                start = i
                result += currProfit
                currProfit = 0
            else:
                currProfit = profit
                
        
        if currProfit > 0:
            result += currProfit
        
        return result
            
                
                
        