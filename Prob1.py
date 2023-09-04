class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #Here, we can sell whenever current prices is larger than previous.
        #TC - O(n), SC - O(1)
        profit=0
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                profit+=prices[i]-prices[i-1]
        return profit



        