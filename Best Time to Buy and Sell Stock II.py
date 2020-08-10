class Solution:
    
    """
        
        Name : Shahreen Shahjahan Psyche
        Time : O(1)
        Space : O(1)

        Paseed Test Cases : Yes
        
    
    """
    def maxProfit(self, prices: List[int]) -> int:
        # Used a greedy method to solve this. Whenever I am getting the cheap price than the next day, I am buying it.
        # I keep the stock until the price starts going down
        profit = 0
        curr_value = -1
        
        for i in range(0, len(prices)):
            if i+1 < len(prices):
                if curr_value == -1 and prices[i+1] > prices[i]:
                    curr_value = prices[i]
                elif curr_value != -1 and prices[i+1] < prices[i]:
                    profit += prices[i] - curr_value
                    curr_value = -1
            else:
                if curr_value != -1:
                    profit += prices[i] - curr_value
                
                
        return profit
