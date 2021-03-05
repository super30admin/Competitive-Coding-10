class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if(len(prices)<=1):
            return 0
        sum1=0
        for i in range(0,len(prices)-1):
            if(prices[i]<prices[i+1]):
                sum1+= prices[i+1]-prices[i]
        return sum1
