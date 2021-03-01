#time: O(n)
#space: O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if(prices==[]):
            return 0
        maxprofit=0
        start=0
        end=1
        while(end<len(prices)):
            if(prices[end]>prices[end-1]):
                end+=1
                if(end==len(prices)):
                    maxprofit+=prices[end-1]-prices[start]
            else:
                maxprofit+=prices[end-1]-prices[start]
                start=end
                end+=1
        return maxprofit
        