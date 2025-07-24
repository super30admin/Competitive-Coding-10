class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #Greedy-> calculate profits for only positive slopes
        buy = 0
        total = 0
        for sell in range(1, len(prices)):
            if prices[sell] > prices[buy]:
                total += (prices[sell] - prices[buy])
            buy += 1
        return total
            
                
        