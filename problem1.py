# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes


from ast import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxpro = 0

        n = len(prices)
        for i in range(1,n):
            if prices[i] > prices[i -1]:
                maxpro += prices[i] - prices[i -1]
        
        return maxpro
                
        