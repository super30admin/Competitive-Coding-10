# Time Complexity: O(n) where n is the number of prices.
# Space Complexity: O(1) since we are using a constant amount of space.
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices == None or len(prices) == 0:
            return 0
        result = 0

        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                result += prices[i] - prices[i-1]
        return result