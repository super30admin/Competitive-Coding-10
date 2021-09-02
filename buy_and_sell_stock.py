#time: O(n)
#space:O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)<2:
            return 0
        max_val=min_val=prices[0]
        profit = 0
        
        for val in (prices[1:]):
            if val>=max_val:
                max_val=val
                # profit+= max(profit,max_val-min_val)
            else:
                profit+= max_val-min_val
                min_val=max_val=val
        profit+= max_val-min_val
        return profit