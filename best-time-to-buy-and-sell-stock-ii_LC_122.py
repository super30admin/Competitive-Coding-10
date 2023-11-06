#TC:O(N) SC:O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        sum=0
        for i,val in enumerate(prices):
            if i < len(prices)-1 and val<prices[i+1]:
                sum=sum+prices[i+1]-val
        return sum        
