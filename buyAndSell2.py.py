'''
Time Complexity: 0(n)
Space Complexity: 0(1)
Run on leet-code: Yes
Funda : buy low and sell high --- buy the dip ..
        also if you sell on a day, you can purchase on the same day ..

'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        ptrA = 0
        ptrB = ptrA+1
        
        max_profit = 0
        
        while ptrB<len(prices):
            buy = prices[ptrA]
            sell = prices[ptrB]
            
            if buy<=sell:
                max_profit+=(sell-buy)
                ptrA+=1
            
            else:
                ptrA=ptrB
            
            ptrB+=1
        
        return max_profit