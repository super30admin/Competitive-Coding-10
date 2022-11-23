class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        p1 = 1
        profits = 0
        
        for i in range(len(prices) - 1):
            if prices[p1] > prices[i]:
                profits += prices[p1] - prices[i]
            p1 += 1
            
        return profits
    
    # TC: O(n)
    # SC: O(1)
    