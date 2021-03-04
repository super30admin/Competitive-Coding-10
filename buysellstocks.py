class Solution:
    
    """
    Description: buy and sell stocks at peak and valley to maximize profit    
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Approach:
    - find peak and valley depending on the index of the list prices
    - add peak - valley to the max profit until we keep finding peak and valleys 
    """
    
    def maxProfit(self, prices: List[int]) -> int:
        
        if len(prices) == 0: return 0
        
        i = 0; peak = prices[0]; valley = prices[0]
        max_profit = 0
        
        while i < len(prices) - 1:
            
            # Find valley
            while i < len(prices) - 1 and prices[i] >= prices[i + 1]:
                i += 1
            valley = prices[i]
            
            # Find peak
            while i < len(prices) - 1 and prices[i] <= prices[i + 1]:
                i += 1
            peak = prices[i]
                
            max_profit += peak - valley
            
        return max_profit
