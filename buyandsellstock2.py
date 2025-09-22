#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        curr_min=prices[0]
        profit=0

        for i in range(1,n):
            curr_min=min(curr_min,prices[i])

            if prices[i]>prices[i-1]:
                profit+= (prices[i]-curr_min)
                curr_min=prices[i]

        return profit