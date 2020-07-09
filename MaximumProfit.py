#Time Complexity : O(N) where N is number of elemeents
#Space Complexity :O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max1 = 0
        sum1 = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                max1 = max(prices[i] - prices[i-1],0)
                sum1+=max1
                i+=1
        return sum1